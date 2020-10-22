package com.ts.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.dto.Events;
import com.ts.dto.Organizers;
import com.ts.db.Hibernate;

public class EventsDAO {




	private SessionFactory factory = null;
	

	
	public int upload(Events event) {
		System.out.println(event); 
		return Hibernate.addObject(event);
	}

}