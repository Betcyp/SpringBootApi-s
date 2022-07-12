package com.npci.SpringBootApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name = "EMAIL_ID",unique = true, nullable=false)
	private String emailId;
	
	@Column(name = "USERNAME", unique = true, nullable=false)
	private String userName;
	
	@Column(name = "PASSWORD", nullable=false)
	private String password;

	

	@Override
	public String toString() {
		return "User [id=" + id + ", emailId=" + emailId + ", userName=" + userName + ", password=" + password + "]";
	}

	public User(long id, String emailId, String userName, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
	}

	public User() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	
}
