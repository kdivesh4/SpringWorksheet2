package com.springcore.worksheet2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	@Autowired
	@Qualifier("add2")
	private Address add;

	
	public Address getAdd() {
		return add;
	}
	
	public void setAdd(Address add) {
		this.add = add;
	}

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Student(Address add) {
		super();
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [add=" + add + "]";
	}
	
	
}
