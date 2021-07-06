package com.itboyst.facedemo.mapper;

import java.util.ArrayList;

import com.itboyst.facedemo.dto.Dept;
import com.itboyst.facedemo.dto.Emp;
import com.itboyst.facedemo.dto.Employee;
import com.itboyst.facedemo.dto.New;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface DeptDao {

	Dept get_dept(int ids);
	
	Employee get_employee(int a);
	
	ArrayList<Employee> get_All();

	void deleteone(int i);

	Employee Oneselect(int i);

	ArrayList<New> get_new();

	void update(Emp ee);
	

}
