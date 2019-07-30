package com.service.classroom.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.classroom.entity.Teacher;
import com.service.classroom.repository.ITeacherRepo;
import com.service.classroom.service.ITeacherServ;

@Service
public class TeacherServImpl implements ITeacherServ{
	
	@Autowired
	ITeacherRepo iTeacherRepo;

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return iTeacherRepo.save(teacher);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return iTeacherRepo.saveAndFlush(teacher);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		return iTeacherRepo.findAll();
	}

	@Override
	public void getTeacher(int teacherId) {
		// TODO Auto-generated method stub
		iTeacherRepo.findById(teacherId);
		
	}

	@Override
	public void deleteTeacher(int teacherId) {
		// TODO Auto-generated method stub
		iTeacherRepo.deleteById(teacherId);
		
	}

}
