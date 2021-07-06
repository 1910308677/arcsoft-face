package com.itboyst.facedemo.dto;

import lombok.Data;

@Data
public class Employee {
	private int id;
	private String name;
	private String sex;
	private int salacy;
	private int s_id;
	private Dept dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getSalacy() {
		return salacy;
	}
	public void setSalacy(int salacy) {
		this.salacy = salacy;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
