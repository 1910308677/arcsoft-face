package com.itboyst.facedemo.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.itboyst.facedemo.dto.User;
import com.itboyst.facedemo.service.UserService;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userservice;
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login() {
		return new ModelAndView("Dept/Dept_list");
	}
	@RequestMapping(value="/LogOut",method=RequestMethod.GET)
	public ModelAndView logout(HttpSession session) {
		 session.removeAttribute("user");
		 session.invalidate();
		return new ModelAndView("login");
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView register(User user, HttpSession session) {
		userservice.register(user);
        session.setAttribute("us",user);
        return new ModelAndView("indexdemo");
	}
	@RequestMapping(value="/MimaUpdate",method=RequestMethod.POST)
	public ModelAndView MimaUpdate(String id,String new_pass) {
		userservice.Update_Mima(new_pass, id);
		return new ModelAndView("redirect:/user/LogOut");
	}
	@RequestMapping(value="/UserUpdate",method=RequestMethod.POST)
	public ModelAndView UserUpdate(User user) {
		userservice.Update(user);
		return new ModelAndView("Dept/Dept_list");
	}
}
