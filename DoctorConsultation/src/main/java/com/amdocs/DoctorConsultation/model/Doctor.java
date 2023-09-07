package com.amdocs.DoctorConsultation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private long DoctorId;
	private String DoctorName;
	private String DoctorEmail;
	private int DoctorAge;
	public long getDoctorId() {
		return DoctorId;
	}
	
	public Doctor() {
		
	}
	
	
	public Doctor(long doctorId, String doctorName, String doctorEmail, int doctorAge) {
		super();
		DoctorId = doctorId;
		DoctorName = doctorName;
		DoctorEmail = doctorEmail;
		DoctorAge = doctorAge;
	}

	public void setDoctorId(long doctorId) {
		DoctorId = doctorId;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public String getDoctorEmail() {
		return DoctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
		DoctorEmail = doctorEmail;
	}
	public int getDoctorAge() {
		return DoctorAge;
	}
	public void setDoctorAge(int doctorAge) {
		DoctorAge = doctorAge;
	}
	
	
}
