package com.service.family.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.family.entity.FamilyMember;
import com.service.family.repository.IFamilyMemberRepo;
import com.service.family.service.IFamilyMemberServ;

@Service
public class FamilyMemberServImpl implements IFamilyMemberServ {
	
	@Autowired
	IFamilyMemberRepo iFamilyMemberRepo;

	@Override
	public FamilyMember saveFamilyMember(FamilyMember familyMember) {
		// TODO Auto-generated method stub
		return iFamilyMemberRepo.save(familyMember);
	}

	@Override
	public FamilyMember updateFamilyMember(FamilyMember familyMember) {
		// TODO Auto-generated method stub
		return iFamilyMemberRepo.saveAndFlush(familyMember);
	}

	@Override
	public List<FamilyMember> getAllFamilyMember() {
		// TODO Auto-generated method stub
		return iFamilyMemberRepo.findAll();
	}

	@Override
	public void getFamilyMember(int familyMemberId) {
		// TODO Auto-generated method stub
		iFamilyMemberRepo.findById(familyMemberId);
		
	}

	@Override
	public void deleteFamilyMember(int familyMemberId) {
		// TODO Auto-generated method stub
		iFamilyMemberRepo.deleteById(familyMemberId);
		
	}

}
