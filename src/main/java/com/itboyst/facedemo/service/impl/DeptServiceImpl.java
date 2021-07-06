package com.itboyst.facedemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.itboyst.facedemo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.itboyst.facedemo.mapper.DeptDao;
import com.itboyst.facedemo.dto.Dept;
import com.itboyst.facedemo.dto.Emp;
import com.itboyst.facedemo.dto.Employee;
import com.itboyst.facedemo.dto.New;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDao deptdao;

	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public Dept get_dept(int ids) {
		Dept dept = deptdao.get_dept(ids);
		return dept;
	}
	
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public Employee get_employee(int i) {
		Employee employee = deptdao.get_employee(i);
		
		return employee;
	}
	
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public List<Employee> get_all() {
		List<Employee> all = deptdao.get_All();
		return all;
	}

	public void DeleteOne(int i) {
		
		deptdao.deleteone(i);
	}
	
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public Employee Oneselect(int i) {
		
		Employee employee = deptdao.Oneselect(i);
		return employee;
	}
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public ArrayList<New> get_new() {
		
		ArrayList<New> arrayList = deptdao.get_new();
		
		return arrayList;
	}
	
	public void update(Emp ee) {
		
		deptdao.update(ee);
		
	}

}
