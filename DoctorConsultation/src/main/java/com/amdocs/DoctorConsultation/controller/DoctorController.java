package com.amdocs.DoctorConsultation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.DoctorConsultation.model.Doctor;
import com.amdocs.DoctorConsultation.service.DoctorService;


@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
	
	private DoctorService doctorService;
	
	@Autowired
	public DoctorController(DoctorService doctorService) {
		this.doctorService=doctorService;
	}
	
	@GetMapping("/alldoctors")
	public List<Doctor> GetAllDoctoes(Doctor doctor){
		
		return doctorService.getAllDoctors();
	}
	
	@GetMapping("/{id}")
	public Doctor getDoctorById(@PathVariable Long id) {
		return doctorService.getDoctorById(id);
	}
	
	@PostMapping("/setdoctor")
	public Doctor setDoctor(@RequestBody Doctor doctor) {
		return doctorService.setDoctor(doctor);
	}
	
	@PutMapping("/updatedoctor/{id}")
	public Doctor updateDoctor(@PathVariable Long id,@RequestBody Doctor doctor) {
		return doctorService.updateDoctor(id,doctor);
	}
	
	@DeleteMapping("/{id}")
	public void deleteDoctor(@PathVariable Long id) {
		doctorService.deleteDoctor(id);
	}
	
}
