package com.lancesoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lancesoft.entity.Doctor;
@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
public Doctor findBySpecialityAndLocation(String  speciality,String location);
boolean existsByUsername(String username);
}
