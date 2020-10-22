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

import com.ts.dto.Events;


@XmlRootElement
@Entity
public class Organizers{
	
	@Id@GeneratedValue
	private int organizerId;
	private String organizerName;
	private String gender;
	private String email;
	private String organizerInstitute;
	private String password;
	
	@OneToMany(mappedBy="organizer",fetch = FetchType.LAZY)
	private Set<Events> eventList =new HashSet<Events>();
	
	
	


	public Organizers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrganizerId() {
		return organizerId;
	}

	public void setOrganizerId(int organizerId) {
		this.organizerId = organizerId;
	}

	public String getOrganizerName() {
		return organizerName;
	}

	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
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

	public String getOrganizerInstitute() {
		return organizerInstitute;
	}

	public void setOrganizerInstitute(String organizerInstitute) {
		this.organizerInstitute = organizerInstitute;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Events> getEventList() {
		return eventList;
	}

	public void setEventList(Set<Events> eventList) {
		this.eventList = eventList;
	}


	@Override
	public String toString() {
		return "Organizers [organizerId=" + organizerId + ", organizerName=" + organizerName + ", gender=" + gender
				+ ", email=" + email + ", organizerInstitute=" + organizerInstitute + ", password=" + password
				+ ", eventList=" + eventList + "]";
	}
		
}