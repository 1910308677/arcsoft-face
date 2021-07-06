package com.itboyst.facedemo.dto;

import lombok.Data;

@Data
public class New {
	private int dept;
	private String  bumen;
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public String getBumen() {
		return bumen;
	}
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
}
