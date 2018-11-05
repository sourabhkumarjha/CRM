package com.extremecrmtask;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Task {
	
	private Long id;
	private String data;
	private String startTime;
	private String StopTime;
	private String descriptaion;
	@ManyToOne
	@JoinColumn(name="USER_EMAIL")
	private User user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStopTime() {
		return StopTime;
	}
	public void setStopTime(String stopTime) {
		StopTime = stopTime;
	}
	public String getDescriptaion() {
		return descriptaion;
	}
	public void setDescriptaion(String descriptaion) {
		this.descriptaion = descriptaion;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Task(String data, String startTime, String stopTime, String descriptaion, User user) {
		this.data = data;
		this.startTime = startTime;
		StopTime = stopTime;
		this.descriptaion = descriptaion;
		this.user = user;
	}
	public Task(String data, String startTime, String stopTime, String descriptaion) {
		this.data = data;
		this.startTime = startTime;
		StopTime = stopTime;
		this.descriptaion = descriptaion;
	}
	public Task() {
		
	}
	

}
