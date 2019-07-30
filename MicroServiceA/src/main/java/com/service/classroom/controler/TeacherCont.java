package com.service.classroom.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.classroom.entity.Teacher;
import com.service.classroom.service.ITeacherServ;

@RestController
public class TeacherCont {
	
	@Autowired ITeacherServ iTeacherServ;
	
	@PostMapping("/teac/save")
	public Teacher Save (@RequestBody Teacher teacher) {
		return iTeacherServ.saveTeacher(teacher);
	}
	
	@PutMapping("/teac/save")
	public Teacher Update(@RequestBody Teacher teacher) {
		return iTeacherServ.updateTeacher(teacher);
	}
	
	@DeleteMapping("/teac/delete")
	public void Delete(int teacherId) {
		iTeacherServ.deleteTeacher(teacherId);
	}
	
	@GetMapping("/teac/get")
	public List<Teacher> getAllTeachers(){
		return iTeacherServ.getAllTeacher();
	}
	
	@GetMapping("/teac/get/{id}")
	public void getTeacher(int teacherId) {
		iTeacherServ.getTeacher(teacherId);
	}

}
