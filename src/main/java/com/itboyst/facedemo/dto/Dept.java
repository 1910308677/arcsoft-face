package com.itboyst.facedemo.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Dept {
private int dept;
private String  bumen;
private ArrayList<Employee> employee;
public int getDept() {
	return dept;
}
public void setDept(int dept) {
	this.dept = dept;
}

public ArrayList<Employee> getEmployee() {
	return employee;
}
public void setEmployee(ArrayList<Employee> employee) {
	this.employee = employee;
}
public String getBumen() {
	return bumen;
}
public void setBumen(String bumen) {
	this.bumen = bumen;
}
}
