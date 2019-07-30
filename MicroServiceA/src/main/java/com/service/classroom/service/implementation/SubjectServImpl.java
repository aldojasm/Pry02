package com.service.classroom.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.classroom.entity.Subject;
import com.service.classroom.repository.ISubjectRepo;
import com.service.classroom.service.ISubjectServ;

@Service
public class SubjectServImpl implements ISubjectServ{
	
	@Autowired
	ISubjectRepo iSubjectRepo;

	@Override
	public Subject saveSubject(Subject subject) {
		// TODO Auto-generated method stub
		return iSubjectRepo.save(subject);
	}

	@Override
	public Subject updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		return iSubjectRepo.saveAndFlush(subject);
	}

	@Override
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return iSubjectRepo.findAll();
	}

	@Override
	public void getSubject(int subjectId) {
		// TODO Auto-generated method stub
		iSubjectRepo.findById(subjectId);
		
	}

	@Override
	public void deleteSubject(int subjectId) {
		// TODO Auto-generated method stub
		iSubjectRepo.deleteById(subjectId);
		
	}

	


}
