package com.service.classroom.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.classroom.entity.StudentClass;
import com.service.classroom.repository.IStudentClassRepo;
import com.service.classroom.service.IStudentClassServ;

@Service
public class StudentClassServImpl implements IStudentClassServ {
	
	@Autowired
	IStudentClassRepo iStudentClassRepo;

	@Override
	public StudentClass saveStudentClass(StudentClass studentClass) {
		// TODO Auto-generated method stub
		return iStudentClassRepo.save(studentClass);
	}

	@Override
	public StudentClass updateStudentClass(StudentClass studentClass) {
		// TODO Auto-generated method stub
		return iStudentClassRepo.saveAndFlush(studentClass);
	}

	@Override
	public List<StudentClass> getAllStudentClass() {
		// TODO Auto-generated method stub
		return iStudentClassRepo.findAll();
	}

	@Override
	public void getStudentClass(int studentClassId) {
		// TODO Auto-generated method stub
		iStudentClassRepo.findById(studentClassId);
		
	}

	@Override
	public void deleteStudentClass(int studentClassId) {
		// TODO Auto-generated method stub
		iStudentClassRepo.deleteById(studentClassId);
		
	}

	

	

}
