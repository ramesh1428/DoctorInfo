package com.techment.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.modal.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor,Doctor> {

}
