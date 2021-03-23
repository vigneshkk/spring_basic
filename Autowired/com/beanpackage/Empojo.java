package com.beanpackage;

import org.springframework.beans.factory.annotation.Autowired;
public class Empojo {
	
	@Autowired
	private Department department;
	private String empName;
	private String empLocation;
	
//	public Empojo(Department department) {
//		this.department=department;
//	}
	
//	public void setDepartment(Department department) {
//		this.department = department;
//	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public void  helloWorld() {
		System.out.println(this.empName+"   "+this.empLocation);
		this.department.printName();
	}

}
