package com.techment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.modal.Doctor;
import com.techment.service.DoctorService;

@RestController
public class DoctorController {
	
	
	@Autowired
	DoctorService doctorservice; 
	
	@PostMapping("/doc")
	public Doctor addDoc(@RequestBody Doctor doctor)
	{
		return doctorservice.addDoc(doctor);
	}
	@RequestMapping("/hello")
	public String hello() {
		return "hello Ramesh";
	}
	
}
