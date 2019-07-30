package com.service.classroom.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.classroom.entity.StudentClass;
import com.service.classroom.service.IStudentClassServ;

@RestController
public class StundentClassCont {
	
	@Autowired
	private IStudentClassServ iStudentClassServ;
	
	@PostMapping("/studclas/save")
	public StudentClass Save(@RequestBody StudentClass studentClass) {
		return iStudentClassServ.saveStudentClass(studentClass);
	}
	
	@PutMapping("/studclas/update")
	public StudentClass Update(@RequestBody StudentClass studentClass) {
		return iStudentClassServ.updateStudentClass(studentClass);
	}
	
	@DeleteMapping("/studclas/delete")
	public void Delete(int studentClassId) {
		iStudentClassServ.deleteStudentClass(studentClassId);
	}
	
	@GetMapping("/studclas/all")
	public List<StudentClass> getAllStudentClass(){
		return iStudentClassServ.getAllStudentClass();
	}
	
	@GetMapping("/studclas/get/{id}")
	public void getStudentClass(int studentClassId) {
		iStudentClassServ.getStudentClass(studentClassId);
	}


}
