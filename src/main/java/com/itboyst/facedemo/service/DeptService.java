package com.itboyst.facedemo.service;

import java.util.ArrayList;
import java.util.List;

import com.itboyst.facedemo.dto.Dept;
import com.itboyst.facedemo.dto.Emp;
import com.itboyst.facedemo.dto.Employee;
import com.itboyst.facedemo.dto.New;

public interface DeptService {
	public Dept get_dept(int ids);
	
	public Employee get_employee(int i);
	
	public List<Employee> get_all();
	
	public void DeleteOne(int i);
	
	public Employee Oneselect(int i);
	
	public ArrayList<New> get_new();
	
	public void update(Emp ee);
}
