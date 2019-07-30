package com.service.family.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.family.entity.Family;
import com.service.family.service.IFamilyServ;

@RestController
public class FamilyCont {
	
	@Autowired
	private IFamilyServ iFamilyServ;
	
	@PostMapping("/fami/save")
	public Family Save(@RequestBody Family family){
		return iFamilyServ.saveFamily(family);
	}
	
	@PutMapping("/fami/update")
	public Family Update(@RequestBody Family family) {
		return iFamilyServ.updateFamily(family);
	}
	
	@DeleteMapping("/fami/delete")
	public void Delete(int familyId) {
		iFamilyServ.deleteFamily(familyId);
	}
	
	@GetMapping("/fami/all")
	public List<Family> getAlFamily(){
		return iFamilyServ.getAllFamily();
	}
	
	@GetMapping("/fami/all/{id}")
	public void getFamily(int familyId) {
		iFamilyServ.getFamily(familyId);
	}
	

}
