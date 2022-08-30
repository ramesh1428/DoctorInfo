package com.techment.service;

import java.util.List;

import com.techment.modal.Doctor;

public interface DoctorService {
	Doctor addDoc(Doctor doctor);
	Doctor getDocByID(Doctor doctor);
	Doctor UpdateDoc(Doctor doctor);
	void DelDoc(Doctor doctor);
	List<Doctor> getAllDoc();

}
