package com.atguigu.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = -7344002710919969413L;

	/**
	 * Entity中不映射成列的字段得加@Transient 注解，不加注解也会映射成列
	 */
	@Id
	@GeneratedValue
	private Integer userId;

	@Column(nullable = false, unique = true)
	private String userName;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = true, unique = true)
	private String nickName;

	@Column(nullable = false)
	private String regTime;

	@Transient
	private String aha;
	
	public User() {
		super();
	}

	public User(Integer userId, String userName, String password, String email, String nickName, String regTime) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.nickName = nickName;
		this.regTime = regTime;
	}

	public User(String string, String string2, String string3, String string4, String formattedDate) {
		
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", nickName=" + nickName + ", regTime=" + regTime + "]";
	}

}
