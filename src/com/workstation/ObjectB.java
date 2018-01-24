package com.workstation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

public class ObjectB {
	private ObjectA objectA;

	public ObjectA getObjectA() {
		return objectA;
	}

	public void setObjectA(ObjectA objectA) {
		this.objectA = objectA;
	}
	
	public String getValue(){
		return "hello world";
	}
}
