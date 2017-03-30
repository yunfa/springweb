package com.yunfa.system.entities;

public class FindbugsTest {

	private java.util.Date firstdate;

	private static String str;

	public void setFirstdate(java.util.Date value) {
		this.firstdate = value;
	}

	public java.util.Date getFirstdate() {
		return this.firstdate;
	}

	public static void main(String[] args) {
		str = null;
		if(str.equals("0")) {
			System.out.println("str");
		}
	}
}
