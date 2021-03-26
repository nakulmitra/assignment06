package com.nagarro.management.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="user_login")
public class User {

	private String userid;
	@Column(name="password")
	private String pass;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userid, String pass) {
		super();
		this.userid = userid;
		this.pass = pass;
	}

	public String getUserid() {
		return userid;
	}

	public String getPass() {
		return pass;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", pass=" + pass + "]";
	}
}

