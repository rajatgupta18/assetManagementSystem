package com.csc.bean;

public class User {
	private int userId;
	private int managerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String shortId;
	private String mobileNumber;
	private String  dateOfJoining;
	private String isActive;
	private String userType;
	
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public User(){}
	
	public User(int userId, int managerId, String firstName, String lastName, String email, String password,
			String shortId, String mobileNumber, String dateOfJoining, String isActive/*, String userType*/) {
		super();
		this.userId = userId;
		this.managerId = managerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.shortId = shortId;
		this.mobileNumber = mobileNumber;
		this.dateOfJoining = dateOfJoining;
		this.isActive = isActive;
		//this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}
	
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getShortId() {
		return shortId;
	}
	public void setShortId(String shortId) {
		this.shortId = shortId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
