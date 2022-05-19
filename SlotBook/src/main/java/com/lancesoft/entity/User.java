package com.lancesoft.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private  String firstname;
	 private String lastname;
	 private String mobilenumber;
	 private String emailid;
	 private String gender;
	public int getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public String getGender() {
		return gender;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public User(int id, String firstname, String lastname, String mobilenumber, String emailid, String gender) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilenumber = mobilenumber;
		this.emailid = emailid;
		this.gender = gender;
	}
	 public User()
	 {
		 
	 }
	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", mobilenumber="
				+ mobilenumber + ", emailid=" + emailid + ", gender=" + gender + "]";
	}
	 
	

}
