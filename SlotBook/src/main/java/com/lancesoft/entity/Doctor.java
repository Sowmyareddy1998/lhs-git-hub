package com.lancesoft.entity;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Doctor {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private	int id;
	private String firstname;
	private String lastname;
	private String username;
	private String mobilename;
	private String email;
	private String gender;
	private String speciality;
	private String location;
	@Enumerated(EnumType.STRING)
    private Status status;
    private int experience;
    private Date availabieDate;
    private String  fee;
   
  
   // @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
  // private List<User> user;
  @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
   private List<Slot> slot;
   
   
	public List<Slot> getSlot() {
	return slot;
     }

    public void setSlot(List<Slot> slot) {
	this.slot = slot;
}
   
public int getId() {
		return id;
	}
	public String getLocation() {
		return location;
	}
	public Status getStatus() {
		return status;
	}
	public int getExperience() {
		return experience;
	}
	public Date getAvailabieDate() {
		return availabieDate;
	}
	

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void setAvailabieDate(Date availabieDate) {
		this.availabieDate = availabieDate;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobilename() {
		return mobilename;
	}
	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpeciality() {
		
		return speciality;
	}
	
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public Doctor(Integer id, String firstname, String lastname, String username, String mobilename, String email,
			String gender, String speciality, String location, Status status, int experience, Date availabieDate,
			String fee, List<User> user) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.mobilename = mobilename;
		this.email = email;
		this.gender = gender;
		this.speciality = speciality;
		this.location = location;
		this.status = status;
		this.experience = experience;
		this.availabieDate = availabieDate;
		this.fee = fee;
		
	}
	public Doctor() {
		
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
				+ ", mobilename=" + mobilename + ", email=" + email + ", gender=" + gender + ", speciality="
				+ speciality + ", location=" + location + ", status=" + status + ", experience=" + experience
				+ ", availabieDate=" + availabieDate + ", fee=" + fee + ",  slot=" + slot
				+ "]";
	}

	
	

	

}







	
	
	

