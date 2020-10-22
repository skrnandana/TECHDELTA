package com.ts.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.dto.StudentUsers;
import com.ts.db.Hibernate;

public class StudentUsersDAO {

	private SessionFactory factory = null;

	public static StudentUsers getStudentByUserPass(String loginId,String password) {

		return (StudentUsers)Hibernate.getObjectByEmailPass(loginId,password);
	}

	public int register(StudentUsers studentUser) {
		System.out.println(studentUser); 
		return Hibernate.addObject(studentUser);
	}

	public List<StudentUsers> getAllStudents() {
		List<StudentUsers> students = (List)Hibernate.getObjectListByQuery("From StudentUsers");
		System.out.println("Inside All Employees ..."+students);
		return students;
	}

	public StudentUsers getStudent(int id) {
		return (StudentUsers)Hibernate.getObject(StudentUsers.class,id);
	}

	public static StudentUsers getStudentByEmail(String email) {
		return (StudentUsers)Hibernate.getStudObjectByEmail(email);
	}
}