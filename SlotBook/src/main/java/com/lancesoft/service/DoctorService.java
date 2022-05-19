package com.lancesoft.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lancesoft.entity.Doctor;
import com.lancesoft.entity.Slot;
import com.lancesoft.repo.DoctorRepo;
import com.lancesoft.repo.SlotRepo;




@Service
public class DoctorService  implements AddDoctor{
	@Autowired
	private DoctorRepo docrepo;
	@Autowired
	private SlotRepo slotrepo;
	
	private Doctor doc;
	
	

	@Override
	public void addDoctor(Doctor doctor) {
		//if(docrepo.existsByUsername(doctor.getUsername()))
		
			Slot s=new Slot();
		    List<Slot> s1=new ArrayList<>();
	        doctor.setSlot(s1);
	        doctor.getSlot().add(s);
	        docrepo.save(doctor);
	    	
		
	}
	
		
	

	@Override
	public Doctor specialityAndLocation( Doctor doctor) {
		this.doc=docrepo.findBySpecialityAndLocation( doctor.getSpeciality(),doctor.getLocation());
		System.out.println("hello");
		return doc;
	}

	@Override
	public void AddSlot(Slot slot) {
	
	slotrepo.save(slot);
		}

	

}

	


