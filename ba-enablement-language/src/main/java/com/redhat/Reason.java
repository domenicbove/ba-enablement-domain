package com.redhat;

public class Reason {

	private String reasonMessage; // tell me what happened? was it null?
	private String responseCode;
	
	public Reason(){
		
	}
	
	public Reason(String m){
		this.reasonMessage=m;
	}
	
	public Reason(String m, String c){
		this.reasonMessage=m;
		this.responseCode=c;
	}

	public String getReasonMessage() {
		return reasonMessage;
	}

	public void setReasonMessage(String reasonMessage) {
		this.reasonMessage = reasonMessage;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
}
