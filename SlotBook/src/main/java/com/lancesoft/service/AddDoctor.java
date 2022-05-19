package com.lancesoft.service;

import org.springframework.stereotype.Service;

import com.lancesoft.entity.Doctor;
import com.lancesoft.entity.Slot;

@Service
public interface AddDoctor {
public void addDoctor(Doctor doctor);
public Doctor specialityAndLocation(Doctor doctor);
public void AddSlot(Slot slot);	
//public void addSlotAndDoctor();

}
