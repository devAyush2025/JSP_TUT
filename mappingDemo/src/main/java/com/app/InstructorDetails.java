package com.app;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter 
@Setter
@ToString

@Entity
@Table
public class InstructorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String hobby;
	@Column
	private String subject;
	
	
	
//	private InstructorDetails instructorDetails;
	public InstructorDetails(String hobby, String subject) {
		super();
		this.hobby = hobby;
		this.subject = subject;
	}
	public InstructorDetails() {

	}
//	public InstructorDetails getInstructorDetails() {
//		return instructorDetails;
//	}
//	public void setInstructorDetails(InstructorDetails instructorDetails) {
//		this.instructorDetails = instructorDetails;
//	}
	
	
	
}
