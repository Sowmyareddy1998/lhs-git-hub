package com.lancesoft.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class SlotBook {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Doctor doctor;
	@OneToOne
	private Slot slot;
	@OneToOne
	private User user;
	public int getId() {
		return id;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public Slot getSlot() {
		return slot;
	}
	public User getUser() {
		return user;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public void setSlot(Slot slot) {
		this.slot = slot;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public SlotBook(int id, Doctor doctor, Slot slot, User user) {
		super();
		this.id = id;
		this.doctor = doctor;
		this.slot = slot;
		this.user = user;
	}
	public SlotBook() {
		
	}
	@Override
	public String toString() {
		return "SlotBook [id=" + id + ", doctor=" + doctor + ", slot=" + slot + ", user=" + user + "]";
	}
	
	
	
	
	

}
