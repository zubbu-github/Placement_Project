package com.cg.placement.client;

import com.cg.placement.entities.Student;
import com.cg.placement.service.IStudentService;
import com.cg.placement.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		// CRUD Operation
		Student student = new Student();
		IStudentService service = new StudentServiceImpl();
		
		//Create
	/*	student.setId(102);
		student.setName("Hrithik Roshan");
		student.setCollege("Mumbai University");
		student.setRoll(20);
		student.setQualification("M.Tech");
		student.setCourse("CSE");
		student.setYear(2021);
		student.setCertificate("PLC");
		student.setHallTicketNo(41);
	
        service.addStudent(student);
        System.out.println("Student details is added in the database");
     
		//Retrieve
        student = service.searchStudentById(101);
        System.out.println("ID is : " + student.getId());
        System.out.println("College is  : " + student.getCollege());
        System.out.println("Year is : " + student.getYear());
        */
        
		//Update
        student = service.searchStudentById(100);
        student.setCollege("VTU University");
        service.updateStudent(student);
        System.out.println("Updated Successfully");
        
        //Delete
        student = service.searchStudentById(102);
        service.deleteStudent(student);
        System.out.println("Deleted Successfully");
        
	}
}
