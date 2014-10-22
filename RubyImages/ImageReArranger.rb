#!/usr/bin/ruby -w

require 'rubygems'
require 'rmagick'

#Magick::Image::read("/Users/verbeckjb/Pictures/red-blue-green.png")[0].each_pixel do |pixel, col, row|
#  puts "Pixel at #{col}x#{row}:
#  \tR: #{pixel.red}, G: #{pixel.green}, B: #{pixel.blue}"
#end

#FNAME = "/Users/verbeckjb/Pictures/red-blue-green.png"
FNAME = "/Users/verbeckjb/Pictures/IMG_2576.JPG"

TILE_ROW = 128
TILE_COL = 128

img = Magick::Image.read(FNAME)[0]

TILE_WIDTH = img.columns/TILE_COL
TILE_HEIGHT = img.rows/TILE_ROW

newImage = Magick::Image.new(img.columns, img.rows)

tiles = (TILE_COL * TILE_ROW).times.inject([]) do |arr, idx|
 arr << Magick::Image.constitute(TILE_WIDTH, TILE_HEIGHT, 'RGB', img.dispatch(idx%TILE_COL * TILE_WIDTH,
                                                                               idx/TILE_COL * TILE_HEIGHT,
                                                                               TILE_WIDTH, TILE_HEIGHT, 'RGB'))
end

tiles.shuffle.each_with_index do |tile, idx|
  puts "idx : #{idx} " 
  newImage.composite!(tile, idx%TILE_COL * TILE_WIDTH,
                      idx/TILE_COL * TILE_HEIGHT,
                      Magick::OverCompositeOp)
end

newImage.write("IMG_2576_shuffled.JPG")

