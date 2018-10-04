package com.cubic.project.beans;

public class AdminBean {
	private String aname;
	private String apass;
	public AdminBean(String aname, String apass) {
		this.aname=aname;
		this.apass=apass;
	}
	public void setAname(String aname) {
			this.aname=aname;
	}
	public String getAname() {
		return aname;
	}
	public void setApass(String apass) {
		this.apass=apass;
	}
	public String getApass() {
		return apass;
	}
}
