package com.lancesoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lancesoft.entity.Doctor;
import com.lancesoft.entity.Slot;
import com.lancesoft.service.DoctorService;





@RestController
public class DoctorController {
	@Autowired
	private DoctorService docservice;
	
	@PostMapping("/save")
	public ResponseEntity<String> add(@RequestBody Doctor doctor){
		
			 docservice.addDoctor(doctor);
			return new ResponseEntity<String>("added doctor information successfully", HttpStatus.CREATED);

	}
	@GetMapping("/get")
	public Doctor  getSpeciality(@RequestBody Doctor doctor)
	{
	Doctor doc=	docservice.specialityAndLocation(doctor);
		return doc;
	}
	
	@PostMapping("/slot")
	public ResponseEntity<String> add(@RequestBody Slot slot){
		
			 docservice.AddSlot(slot);
			return new ResponseEntity<String>("added slot successfully", HttpStatus.CREATED);

	}
	
	}
