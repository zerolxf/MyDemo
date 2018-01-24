package com.workstation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjectC {

	@JsonProperty ("Message")
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	//JSON 中message也会绑定到message成员变量
	@JsonProperty ("message")
	public String _getMessage() {
		return message;
	}

	@JsonProperty ("message")
	public void _setMessage(String message) {
		this.message = message;
	}
	
}
