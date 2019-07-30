package com.service.classroom.controler;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.classroom.entity.Subject;
import com.service.classroom.service.ISubjectServ;

@RestController
public class SubjectCont {
	
	@Autowired
	private ISubjectServ iSubjectServ;
	
	@PostMapping("/subj/save")
	public Subject Save(@RequestBody Subject subject) {
		return iSubjectServ.saveSubject(subject);
	}
	
	@PutMapping("/subj/save")
	public Subject Update(@RequestBody Subject subject) {
		return iSubjectServ.updateSubject(subject);
	}
	
	@DeleteMapping("/subj/delete")
	public void Delete(int subjectId) {
		iSubjectServ.deleteSubject(subjectId);
	}
	
	@GetMapping("/subj/get")
	public List<Subject> getAllSubjects(){
		return iSubjectServ.getAllSubjects();
	}
	
	@GetMapping("/cr/subj/{id}")
	public void getTeacher(int teacherId) {
		iSubjectServ.getSubject(teacherId);
	}
	


}
