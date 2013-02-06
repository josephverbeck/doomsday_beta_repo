package com.tutorialspoint;

import java.util.*;

public class JavaCollection {
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;
	
	public List getAddressList() {
		System.out.println("List elements : " + addressList);
		return addressList;
	}
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	public Set getAddressSet() {
		System.out.println("Set elements : " + addressSet);
		return addressSet;
	}
	public void setAddressSet(Set addessSet) {
		this.addressSet = addessSet;
	}
	public Map getAddressMap() {
		System.out.println("Map elements : " + addressMap);
		return addressMap;
	}
	public void setAddressMap(Map addessMap) {
		this.addressMap = addessMap;
	}
	public Properties getAddressProp() {
		System.out.println("Properties elements : " + addressProp);
		return addressProp;
	}
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
}