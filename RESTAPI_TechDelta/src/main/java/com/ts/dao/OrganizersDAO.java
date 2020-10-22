package com.ts.dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.dto.Organizers;
import com.ts.db.Hibernate;

public class OrganizersDAO {

	private SessionFactory factory = null;
	

	public static Organizers getOrganizerByEmailPass(String email,String password) {

		return (Organizers)Hibernate.getObjectByEmailPass(email,password);
	}

	public int register(Organizers organizer) {
		System.out.println(organizer); 
		return Hibernate.addObject(organizer);
	}

	public List<Organizers> getAllOrganizers() {
		List<Organizers> organizers = (List)Hibernate.getObjectListByQuery("From StudentUsers");
		System.out.println("Inside All Employees ..."+organizers);
		return organizers;
	}

	public Organizers getOrganizers(int id) {
		return (Organizers)Hibernate.getObject(Organizers.class,id);
	}

	public static Organizers getOrganizerByEmail(String email) {
		return (Organizers)Hibernate.getObjectByEmail(email);
	}
}