package com.management.server1;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class StudentService {

	StudentDao userDao = new StudentDao();

	public List<Student> getStudents() {
		return userDao.getAllStudents();
	}
	
	public Student updateStudentById(String id, String passed_colloquium, String passed_bachelor_thesis) {
		
		return userDao.updateStudentById(id, passed_colloquium, passed_bachelor_thesis);
	}

}