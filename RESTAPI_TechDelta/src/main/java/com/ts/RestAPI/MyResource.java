package com.ts.RestAPI;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ts.dto.Events;
import com.ts.dto.Organizers;
import com.ts.dto.StudentUsers;
import com.ts.dao.EventsDAO;
import com.ts.dao.OrganizersDAO;
import com.ts.dao.StudentUsersDAO;

@Path("myresource")
public class MyResource {
	@Path("hi")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hi() throws UnsupportedEncodingException {
		System.out.println("Hi...");
		return "Hi Service!";
	}
	
	@Path("registerStudent")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void registerStudent(StudentUsers student) {
		System.out.println("Data Recieved in student Register : " + student);
		StudentUsersDAO studentusersDAO = new StudentUsersDAO();
		studentusersDAO.register(student);
	
	}
	
	@Path("uploadEvent")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void uploadEvent(Events event) {
		System.out.println("Data Recieved in Event Upload : " + event);
		EventsDAO eventsDAO = new EventsDAO();
		eventsDAO.upload(event);
	
	}
	
	

	@Path("getStudentByEmailPass/{email}/{password}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public StudentUsers getEmpByUserPass(@PathParam("email") String email,@PathParam("password") String password) {
		System.out.println("Recieved path params: "+email+" "+password); 
		StudentUsersDAO studentDAO = new StudentUsersDAO();
		StudentUsers student = StudentUsersDAO.getStudentByUserPass(email, password);
		return student;
	}


	@Path("getStudents")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<StudentUsers> getStudents() {

		StudentUsersDAO studenteDAO = new StudentUsersDAO();
		List <StudentUsers> studentList = studenteDAO.getAllStudents();

		return studentList;
	}
	
	@Path("registerOrganizer")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String registerOrganizer(Organizers organizer) {
		System.out.println("Data Recieved in Organizer Register : " +organizer);
		OrganizersDAO organizersDAO = new OrganizersDAO();
		organizersDAO.register(organizer);
		return "Success";
	
	}
	@Path("getOrganizerByEmail/{email}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Organizers getOrganizerByEmail(@PathParam("email") String email) {
		System.out.println("Recieved path params: "+email); 
		OrganizersDAO organizersDAO = new OrganizersDAO();
		Organizers organizer = OrganizersDAO.getOrganizerByEmail(email);
		return organizer;
	}

	@Path("getOrganizerByEmailPass/{email}/{password}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Organizers getOrganizerByEmailPass(@PathParam("email") String email,@PathParam("password") String password) {
		System.out.println("Recieved path params: "+email+" "+password); 
		OrganizersDAO organizersDAO = new OrganizersDAO();
		Organizers organizer = OrganizersDAO.getOrganizerByEmailPass(email, password);
		return organizer;
	}


	@Path("getOrganizers")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Organizers> getOrganizers() {

		OrganizersDAO organizersDAO = new OrganizersDAO();
		List <Organizers> organizerList = organizersDAO.getAllOrganizers();

		return organizerList;
	}
	
	

	@Path("getStudentByEmail/{email}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public StudentUsers getStudentByEmail(@PathParam("email") String email) {
		System.out.println("Recieved path params: "+email); 
		StudentUsersDAO StudentDAO = new StudentUsersDAO();
		StudentUsers student = StudentUsersDAO.getStudentByEmail(email);
		return student;
	}

	
	
	//It is sample code if need to test and insert values into any tables
	/*@Path("registerEmp")
	@GET
	public void registerEmp() {
		DeptDAO deptDao = new DeptDAO();
		
		Department dept = deptDao.getDept(1);
		
		Employee employee = new Employee();
		employee.setEmpName("PASHA");
		employee.setEmail("email@gmail.com");
		employee.setGender("Male");
		employee.setJoinDate(new java.util.Date());
		employee.setDepartment(dept); 
		
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.register(employee);
	
	}*/
	
	//It is sample code if need to test and insert values into any tables
		@Path("registerStudent1")
		@GET
		public String registerStudent1() {
			
			StudentUsers student = new StudentUsers();
			student.setStudentName("Nandana");
			student.setEmail("skrnandana10@gmail.com");
			student.setGender("Female");
			student.setPassword("yoyo");
			
			StudentUsersDAO studentDAO = new StudentUsersDAO();
			studentDAO.register(student);
			
			return "Success";
		
		}

}
