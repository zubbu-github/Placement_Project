package com.cg.placement.service;

import com.cg.placement.entities.Student;

public interface IStudentService {
	
	public Student addStudent(Student student);  
	public Student updateStudent(Student student);  
	public Student searchStudentById(int id);  

	public Student searchStudentByHallTicket(int id); 

	public Student addCertificate(Student student); 

	public Student updateCertificate(Student student);


	public Student deleteStudent(Student student); 

}
