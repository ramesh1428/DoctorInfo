package com.techment.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "book")
	private String book;
	@Column(name = "specialization")
	private String specialization;
	@Column(name = "experience")
	private int yearsOfExperience;
	@Column(name = "neetscore")
	private float neetScore;
	
	public Doctor(int id, String name, String book, String specialization, int yearsOfExperience,
			float neetScore) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
		this.specialization = specialization;
		this.yearsOfExperience = yearsOfExperience;
		this.neetScore = neetScore;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public float getNeetScore() {
		return neetScore;
	}
	public void setNeetScore(float neetScore) {
		this.neetScore = neetScore;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", book=" + book + ", specialization=" + specialization
				+ ", yearsOfExperience=" + yearsOfExperience +  ", neetScore=" + neetScore + "]";
	}
	

}
