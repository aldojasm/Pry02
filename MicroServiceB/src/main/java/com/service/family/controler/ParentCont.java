package com.service.family.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.family.entity.Parent;
import com.service.family.service.IParentServ;

@RestController
public class ParentCont {
	
	@Autowired
	private IParentServ iParentServ;
	
	@PostMapping("/pare/save")
	public Parent Save(@RequestBody Parent parent) {
		return iParentServ.saveParent(parent);
	}
	
	@PutMapping("/pare/update")
	public Parent Update(@RequestBody Parent parent) {
		return iParentServ.updateParent(parent);
	}
	
	@DeleteMapping("/pare/delete")
	public void Delete(int parentId) {
		iParentServ.deleteParent(parentId);
	}
	
	@GetMapping("/pare/all")
	public List<Parent> getAllParent(){
		return iParentServ.getAllParent();
	}
	
	@GetMapping("/pare/get/{id}")
	public void getParent(int parentId) {
		iParentServ.getParent(parentId);
	}

}
