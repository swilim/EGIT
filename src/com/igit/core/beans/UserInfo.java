package com.igit.core.beans;

import java.io.Serializable;

/**
 * 
 * @author l67172
 * @create 2016-05-30
 * @version 1.0
 */
public class UserInfo extends BaseEntiy implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7090674834726460232L;
	
	
	private String name;
	private String password;
	private String sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	
}
