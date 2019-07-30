package com.service.classroom.service;

import java.util.List;

import com.service.classroom.entity.Teacher;

public interface ITeacherServ {
	
	//CRUD
	Teacher saveTeacher(Teacher teacher);
	Teacher updateTeacher(Teacher teacher);
	List<Teacher> getAllTeacher();
	void getTeacher(int teacherId);
	void deleteTeacher(int teacherId);

}
