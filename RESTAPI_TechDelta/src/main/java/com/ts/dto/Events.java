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

import com.ts.dto.Organizers;
import com.ts.dto.Enroll;


@XmlRootElement
@Entity
public class Events{
	
	@Id@GeneratedValue
	private int eventId;
	private String eventName;
	private String eventOrganizer;
	private Date startDate;
	private Date endDate;
	
	@OneToMany(mappedBy="event",fetch = FetchType.LAZY)
	private Set<Enroll> enrollList =new HashSet<Enroll>();
	
	@ManyToOne
	@JoinColumn(name="organizerId")
	private Organizers organizer;
		
	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventOrganizer() {
		return eventOrganizer;
	}

	public void setEventOrganizer(String eventOrganizer) {
		this.eventOrganizer = eventOrganizer;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Set<Enroll> getEnrollList() {
		return enrollList;
	}

	public void setEnrollList(Set<Enroll> enrollList) {
		this.enrollList = enrollList;
	}

	public Organizers getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Organizers organizer) {
		this.organizer = organizer;
	}
	
}