package com.ts.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.ts.dto.Enroll;


@XmlRootElement
@Entity
public class StudentUsers{
	@Id@GeneratedValue
	private int studentId;
	private String studentName;
	private String gender;
	private String email;
	private String studentInstitute;
	private String currentEducation;
	private String password;
	
	@OneToMany(mappedBy="student",fetch = FetchType.LAZY)
	private Set<Enroll> enrollList =new HashSet<Enroll>();

	
	
	public StudentUsers() { 
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getStudentInstitute() {
		return studentInstitute;
	}

	public void setStudentInstitute(String studentInstitute) {
		this.studentInstitute = studentInstitute;
	}

	public String getCurrentEducation() {
		return currentEducation;
	}

	public void setCurrentEducation(String currentEducation) {
		this.currentEducation = currentEducation;
	}

	public Set<Enroll> getEnrollList() {
		return enrollList;
	}

	public void setEnrollList(Set<Enroll> enrollList) {
		this.enrollList = enrollList;
	}	
	
}