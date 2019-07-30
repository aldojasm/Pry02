package com.service.family.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.family.entity.Student;
import com.service.family.repository.IStudentRepo;
import com.service.family.service.IStudentServ;

@Service
public class StudentServImpl implements IStudentServ{
	
	@Autowired
	IStudentRepo iStudentRepo;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return iStudentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return iStudentRepo.saveAndFlush(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return iStudentRepo.findAll();
	}

	@Override
	public void getStudent(int studentId) {
		// TODO Auto-generated method stub
		iStudentRepo.findById(studentId);
		
	}

	@Override
	public void deleteStudent(int studenId) {
		// TODO Auto-generated method stub
		iStudentRepo.deleteById(studenId);
		
	}
	
	

}
