package com.training.entity;

public class RegisterUser {
	
	private String firstName;
	private String lastName;
    private String userType;
	private Long userID;
	private String passWord;
	
	public RegisterUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegisterUser(String firstName, String lastName, String userType, Long userID, String passWord) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
		this.userID = userID;
		this.passWord = passWord;
	}
	

	public RegisterUser(Long userID, String passWord) {
		super();
		this.userID = userID;
		this.passWord = passWord;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	

}
