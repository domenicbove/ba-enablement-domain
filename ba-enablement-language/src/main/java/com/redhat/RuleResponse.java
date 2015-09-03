package com.redhat;

public class RuleResponse {

	@KieQuery(binding = "$business", queryName = "Get Business")
	private Business business;
	
	@KieQuery(binding = "$reason", queryName = "Get Reason")
	private Reason reasons; // messages about why the response Code came bacl

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public Reason getReasons() {
		return reasons;
	}

	public void setReasons(Reason reasons) {
		this.reasons = reasons;
	}

}
