package model;

import java.io.*;

public class User implements Serializable {
	
	private String userId;
	private String userName;
	private String userMail;
	private long userNumber;
	private boolean activeStatus;
	private String password;
	/*
	 * 1 = Go Admin
	 * 2 = Sales Representative;
	 * 3 = Retailer
	 * 4 = Product Master
	 * */
	private int userCategory;
	public  int getUserCategory() {
		return userCategory;
	}

	public  void setUserCategory(int userCategory) {
		this.userCategory = userCategory;
	}
	private static final long serialVersionUID = 7551999649936522523L;

	// Constructor
	public User(String userId, String userName, String userMail, long userNumber, boolean activeStatus,
			String password, int userCategory) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMail = userMail;
		this.userNumber = userNumber;
		this.activeStatus = activeStatus;
		this.password = password;
		this.userCategory = userCategory;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public long getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(long userNumber) {
		this.userNumber = userNumber;
	}
	public boolean isActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
