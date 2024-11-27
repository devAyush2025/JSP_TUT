package com.app;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
	@Override
	public String toString() {
		return "InstructorDetails [id=" + id + ", hobby=" + hobby + ", subject=" + subject + ", instructor="
				+ instructor + "]";
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	@Column
	private String subject;
	@OneToOne(mappedBy = "instructorDetails",cascade = CascadeType.ALL)
	private Instructor instructor;
	
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
