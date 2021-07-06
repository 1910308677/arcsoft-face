package com.itboyst.facedemo.mapper;

import java.util.ArrayList;
import com.itboyst.facedemo.dto.Employee;
import com.itboyst.facedemo.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserDao {
	
	public User login(@Param("username") String username, @Param("password") String password);

	public void register(User user);

	public ArrayList<User> queryall();
	
	public ArrayList<Employee> get_employee(String id);

	public User get_user(String uid);

	public void UserUpdate(User user);

	public void MimaUpdate(String pass, String id);
	
	
}
