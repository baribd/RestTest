package com.bari.jersey.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ExceptionMessage {

	String exceptionMessage;
	String excpetionCode;
	public ExceptionMessage(String exceptionMessage, String excpetionCode) {
		super();
		this.exceptionMessage = exceptionMessage;
		this.excpetionCode = excpetionCode;
	}
	public String getExceptionMessage() {
		return exceptionMessage;
	}
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	public String getExcpetionCode() {
		return excpetionCode;
	}
	public void setExcpetionCode(String excpetionCode) {
		this.excpetionCode = excpetionCode;
	}
	
	
	
}
