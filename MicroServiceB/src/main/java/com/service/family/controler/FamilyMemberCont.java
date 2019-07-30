package com.service.family.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.family.entity.FamilyMember;
import com.service.family.service.IFamilyMemberServ;

@RestController
public class FamilyMemberCont {
	
	@Autowired
	private IFamilyMemberServ iFamilyMemberServ;
	
	@PostMapping("/fame/save")
	public FamilyMember Save(@RequestBody FamilyMember familyMember) {
		return iFamilyMemberServ.saveFamilyMember(familyMember);
	}
	
	@PutMapping("/fame/update")
	public FamilyMember Update(@RequestBody FamilyMember familyMember) {
		return iFamilyMemberServ.updateFamilyMember(familyMember);
	}
	
	@DeleteMapping("/fame/delete")
	public void Delete(int FamilyMemberId) {
		iFamilyMemberServ.deleteFamilyMember(FamilyMemberId);
	}
	
	@GetMapping("/fame/all")
	public List<FamilyMember> getAllFamilyMember(){
		return iFamilyMemberServ.getAllFamilyMember();
	}
	
	@GetMapping("/fame/get/{id}")
	public void getFamilyMember(int familyMemberId) {
		iFamilyMemberServ.getFamilyMember(familyMemberId);
	}
	
	

}
