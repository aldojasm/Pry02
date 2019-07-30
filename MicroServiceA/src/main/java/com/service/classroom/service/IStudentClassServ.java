package com.service.classroom.service;

import java.util.List;

import com.service.classroom.entity.StudentClass;

public interface IStudentClassServ {
	
	//CRUD
	StudentClass saveStudentClass(StudentClass studentClass);
	StudentClass updateStudentClass(StudentClass studentClass);
	List<StudentClass> getAllStudentClass();
	void getStudentClass(int studentClassId);
	void deleteStudentClass(int studentClassId);

}
