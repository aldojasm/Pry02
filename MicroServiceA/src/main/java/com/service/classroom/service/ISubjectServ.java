package com.service.classroom.service;

import java.util.List;

import com.service.classroom.entity.Subject;

public interface ISubjectServ {
	
	//CRUD
	Subject saveSubject(Subject subject);
	Subject updateSubject(Subject subject);
	List<Subject> getAllSubjects();
	void getSubject(int subjectId);
	void deleteSubject(int subjectId);

}
