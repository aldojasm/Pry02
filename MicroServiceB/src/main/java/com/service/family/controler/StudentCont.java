package com.service.family.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.family.entity.Student;
import com.service.family.service.IStudentServ;

@RestController
public class StudentCont {
	
	@Autowired
	private IStudentServ iStudentServ;
	
	@PostMapping("/stud/save")
	public Student Save(@RequestBody Student student) {
		return iStudentServ.saveStudent(student);
	}
	
	@PutMapping("/stud/update")
	public Student update(@RequestBody Student student) {
		return iStudentServ.updateStudent(student);
	}
	
	@DeleteMapping("/stud/delete")
	public void Delete(int studentId) {
		iStudentServ.deleteStudent(studentId);
	}
	
	@GetMapping("/stud/all")
	public List<Student> getAllStudent(){
		return iStudentServ.getAllStudent();
	}
	
	@GetMapping("/stud/get/{id}")
	public void getStudent(int studentId) {
		iStudentServ.getStudent(studentId);
	}
	

}
