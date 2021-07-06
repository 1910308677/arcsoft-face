package com.itboyst.facedemo.service;

import java.util.ArrayList;
import com.itboyst.facedemo.dto.User;

public interface UserService {
	public  User login(String username, String password);
	
	public void register(User user);
	
	public ArrayList<User> queryall();
	
	public User get_User(String uid);
	
	public void Update(User user);
	
	public void Update_Mima(String pass, String id);
}
