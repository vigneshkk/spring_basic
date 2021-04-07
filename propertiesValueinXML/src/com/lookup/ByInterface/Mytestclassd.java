package com.lookup.ByInterface;

public class Mytestclassd {
	private String name,empid;

	public String getName() {
		return name;
	}

	public String getEmpid() {
		return empid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public void printing() {
		System.out.println(name+"   "+empid);
	}
}
