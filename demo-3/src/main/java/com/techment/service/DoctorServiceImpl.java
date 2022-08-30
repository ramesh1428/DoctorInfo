package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.modal.Doctor;
import com.techment.repos.DoctorRepo;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	 DoctorRepo repos;

	@Override
	public Doctor addDoc(Doctor doctor) {
		// TODO Auto-generated method stub
		return repos.save(doctor);
	}

	@Override
	public Doctor getDocByID(Doctor doctor) {
		// TODO Auto-generated method stub
		return repos.getReferenceById(doctor);
	}

	@Override
	public Doctor UpdateDoc(Doctor doctor) {
		// TODO Auto-generated method stub
		return repos.save(doctor);
	}

	@Override
	public void DelDoc(Doctor doctor) {
		// TODO Auto-generated method stub
		 repos.delete(doctor);
	}

	@Override
	public List<Doctor> getAllDoc() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}
	

}
