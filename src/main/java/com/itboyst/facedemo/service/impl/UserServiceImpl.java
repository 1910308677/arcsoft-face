package com.itboyst.facedemo.service.impl;

import java.util.ArrayList;

import com.itboyst.facedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.itboyst.facedemo.mapper.UserDao;
import com.itboyst.facedemo.dto.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userdao;

	//@Transactional(propagation=Propagation.SUPPORTS,readOnly=true) 查询方法
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public User login(String username, String password) {
		User user = userdao.login(username, password);
		return user;
	}
	public void register(User user) {
		userdao.register(user);
	}

	public ArrayList<User> queryall() {
		// TODO Auto-generated method stub
		return null;
	}

	public User get_User(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

	public void Update(User user) {
		userdao.UserUpdate(user);

	}
	public void Update_Mima(String pass, String id) {
		userdao.MimaUpdate(pass, id);
	}

}
