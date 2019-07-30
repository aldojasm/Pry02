package com.service.family.service;

import java.util.List;

import com.service.family.entity.FamilyMember;

public interface IFamilyMemberServ {
	
	//CRUD
	FamilyMember saveFamilyMember(FamilyMember familyMember);
	FamilyMember updateFamilyMember(FamilyMember familyMember);
	List<FamilyMember> getAllFamilyMember();
	void getFamilyMember(int familyMemberId);
	void deleteFamilyMember(int familyMemberId);

}
