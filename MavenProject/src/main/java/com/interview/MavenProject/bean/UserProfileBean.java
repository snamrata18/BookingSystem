package com.interview.MavenProject.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name=" userProfile")

public class UserProfileBean {
	
	@Id
	@Column(name="userId")
	private int userId;
	@Column(name="userName")
	private String userName;
	@Column(name="userCity")
	private String userCity;
	@Column(name="gender")
	private String gender;
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
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "UserProfileBean [userId=" + userId + ", userName=" + userName + ", userCity=" + userCity + ", gender="
				+ gender + "]";
	}
	public UserProfileBean(int userId, String userName, String userCity, String gender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userCity = userCity;
		this.gender = gender;
	}
	public UserProfileBean() {
		super();
	}
}

