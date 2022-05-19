package com.lancesoft.entity;

import java.time.LocalTime;
import java.util.Date;

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
public class Slot {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	private Date date;
	private LocalTime timeslot;
//     @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	private Doctor doctor;

	public int getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public LocalTime getTimeslot() {
		return timeslot;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public void setDayid(Date date) {
		this.date = date;
	}

	public void setTimeslot(LocalTime timeslot) {
		this.timeslot = timeslot;
	}

	

	public Slot(Integer id, Date dayid, LocalTime timeslot, Doctor doctor) {
		super();
		this.id = id;
		this.date = date;
		this.timeslot = timeslot;
		
	}
	public Slot() {
		
	}

	@Override
	public String toString() {
		return "Slot [id=" + id + ", date=" + date + ", timeslot=" + timeslot + "]";
	}


	
	
	
	
	

}
