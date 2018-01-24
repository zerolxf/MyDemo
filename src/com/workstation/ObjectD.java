package com.workstation;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjectD {

	List<ObjectC> list;

	@JsonProperty ("List")
	public List<ObjectC> getList() {
		return list;
	}

	@JsonProperty ("List")
	public void setList(List<ObjectC> list) {
		this.list = list;
	}
	
}
