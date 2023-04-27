package com.cafe.user.domain;

public class User {
	private String userID;
	private String userPW;
	private String userName;
	private String userPhone;
	private int userPoint;
	
	public User() {}

	public User(String userID, String userPW, String userName, String userPhone, int userPoint) {
		super();
		this.userID = userID;
		this.userPW = userPW;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userPoint = userPoint;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public int getUserPoint() {
		return userPoint;
	}

	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	
	public String toString() {
		return "♥♥♥ 아이디: "+userID+" | 이름: "+userName+" | 전화번호: "+userPhone+" | 잔여 포인트:"+userPoint;
	}
	
}
