package com.amdocs.DoctorConsultation.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.DoctorConsultation.model.Doctor;
import com.amdocs.DoctorConsultation.repo.DoctorRepo;


@Service
public class DoctorService {
	private DoctorRepo doctorRepo;

	@Autowired
	public DoctorService(DoctorRepo doctorRepo) {
		this.doctorRepo = doctorRepo;
	}

	public List<Doctor> getAllDoctors() {
		return doctorRepo.findAll();
	}

	public Doctor getDoctorById(Long id) {
		return doctorRepo.findById(id).orElse(null);
	}

	public Doctor setDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}

	public Doctor updateDoctor( Long id, Doctor doctor) {
		
		Doctor existing_doctor = doctorRepo.findById(id).orElse(null);
		if(existing_doctor!=null) {
			existing_doctor.setDoctorName(doctor.getDoctorName());
			existing_doctor.setDoctorEmail(doctor.getDoctorEmail());
			existing_doctor.setDoctorAge(doctor.getDoctorAge());
		}
		return doctorRepo.save(existing_doctor);
	}

	public void deleteDoctor(Long id) {
		Doctor doctor= doctorRepo.findById(id).orElse(null);
		if(doctor!=null) {
			doctorRepo.delete(doctor);
		}
	}
}
