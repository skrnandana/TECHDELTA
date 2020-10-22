package com.ts.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.ts.dto.Events;
import com.ts.dto.StudentUsers;

@XmlRootElement
@Entity
public class Enroll{
	
	@Id@GeneratedValue
	private int enrollId;
	private Date enrollDate;
	
	@ManyToOne
	@JoinColumn(name="eventId")
	private Events event;
	
	@ManyToOne
	@JoinColumn(name="studentId")
	private StudentUsers student;

	public Enroll() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEnrollId() {
		return enrollId;
	}

	public void setEnrollId(int enrollId) {
		this.enrollId = enrollId;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public Events getEvent() {
		return event;
	}

	public void setEvent(Events event) {
		this.event = event;
	}

	public StudentUsers getStudent() {
		return student;
	}

	public void setStudent(StudentUsers student) {
		this.student = student;
	}
	
	
	
}