package com.stackroute.QG.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "qnuser")
public class User {

	private int userId;
	private String userName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User() {

	}

	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
}
