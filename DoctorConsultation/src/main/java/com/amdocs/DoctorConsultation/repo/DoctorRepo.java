package com.amdocs.DoctorConsultation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.DoctorConsultation.model.Doctor;

public interface DoctorRepo  extends JpaRepository<Doctor,Long>{
	
}
