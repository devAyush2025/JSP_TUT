package com.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "InstructorDetails1")
public class InstructorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String hobby;
	private String subject;
	
	
	
	public InstructorDetails() {
		super();
	}

	public InstructorDetails(int id, String hobby, String subject) {
		super();
		this.id = id;
		this.hobby = hobby;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "InstructorDetails [id=" + id + ", hobby=" + hobby + ", subject=" + subject + "]";
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
