package com.extremecrmtask;

import java.util.List;

public class Role {
	
	private String name;
	private List<User> user;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public Role(String name, List<User> user) {
		this.name = name;
		this.user = user;
	}
	public Role() {
	}
	public Role(String name) {
		this.name = name;
	}
	
	

}
