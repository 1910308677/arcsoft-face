package com.itboyst.facedemo.dto;

import lombok.Data;

@Data
public class User {
private String uid;
private String name;
private String sex;
private String city;
private String password;
public String getUid() {
	return uid;
}
public void setUid(String uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
