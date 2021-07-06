package com.itboyst.facedemo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itboyst.facedemo.dto.Dept;
import com.itboyst.facedemo.dto.Emp;
import com.itboyst.facedemo.dto.Employee;
import com.itboyst.facedemo.dto.New;
import com.itboyst.facedemo.service.DeptService;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	private DeptService deptservice;
	@RequestMapping(value="AllDept",method=RequestMethod.POST)
	public @ResponseBody Dept alldept(String bs) {
		int ids=Integer.parseInt(bs);
		Dept dept=deptservice.get_dept(ids);
		return dept;
	}
	@RequestMapping(value="OneDept",method=RequestMethod.GET)
	public @ResponseBody Map<String,ArrayList<Employee>> onedept(String id) {
		int i=Integer.parseInt(id);
		Employee employee = deptservice.get_employee(i);
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(employee);
		Map<String, ArrayList<Employee>> map=new HashMap<String,ArrayList<Employee>>();	
		map.put("data",list);
		return map;
	}
	@RequestMapping(value="EmployeeAll",method=RequestMethod.POST)
	public @ResponseBody Map<String,List<Employee>> EmployeeAll() {
		List<Employee> all = deptservice.get_all();
		Map<String, List<Employee>> map=new HashMap<String,List<Employee>>();	
		map.put("data",all);
		return map;
	}
	@RequestMapping(value="DeleteEmployee",method=RequestMethod.GET)
	public ModelAndView DeleteEmployee(String id) {
		int i=Integer.parseInt(id);
		deptservice.DeleteOne(i);
		return new ModelAndView("Dept/Dept_list");
	}
	@RequestMapping(value="OneEmployee",method=RequestMethod.GET)
	public ModelAndView OneEmployee(String id, ModelMap modelmap) {
		int i=Integer.parseInt(id);
		Employee ee=deptservice.Oneselect(i);
		ArrayList<New> list=deptservice.get_new();
		modelmap.addAttribute("ee", ee);
		modelmap.addAttribute("list",list);
		return new ModelAndView("Dept/eindex",modelmap);
	}
	@RequestMapping(value="UpdateEmployee",method=RequestMethod.POST)
	public ModelAndView UpdateEmployee(Emp emp,ModelMap modelmap) {
		deptservice.update(emp);
		modelmap.addAttribute("userid",emp.getId());
		return new ModelAndView("Dept/Dept_list",modelmap);
	}
}
