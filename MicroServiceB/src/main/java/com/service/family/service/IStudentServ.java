package com.service.family.service;

import java.util.List;

import com.service.family.entity.Student;

public interface IStudentServ {
	
	//CRUD
	Student saveStudent(Student student);
	Student updateStudent(Student student);
	List<Student> getAllStudent();
	void getStudent(int studentId);
	void deleteStudent(int studenId);

}
