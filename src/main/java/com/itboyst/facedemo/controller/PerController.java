package com.itboyst.facedemo.controller;

import com.itboyst.facedemo.dto.User;
import com.itboyst.facedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
  * @Author Bin
  * @Date 2021/6/17 11:32
 **/
 @Controller
public class PerController  {
    @Autowired
    private UserService userservice;
    @GetMapping("/log")
    public String log(){
        return "login";
    }
    @GetMapping("/index")
    public ModelAndView index(){
        return  new ModelAndView("User/index");
    }
    @GetMapping("/Dept_list")
    public ModelAndView dept_list(){
        return new ModelAndView("Dept/Dept_list");
    }
    @GetMapping("/user_Mima")
    public ModelAndView article_list(){
        return new ModelAndView("User/user_Mima");
    }
    @GetMapping("/user_info")
    public ModelAndView user_info(){
        return new ModelAndView("User/user_info");
    }
    @PostMapping("/login_face")
    public ModelAndView login_face(@RequestParam("username") String username, @RequestParam("password")String password, HttpSession session){
        User user=userservice.login(username, password);
        if(user!=null) {
            session.setAttribute("user",user);
            return new ModelAndView("login_face");
        }
        return new ModelAndView("error");
    }
}
