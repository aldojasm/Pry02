package com.service.family.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.family.entity.Family;
import com.service.family.repository.IFamilyRepo;
import com.service.family.service.IFamilyServ;

@Service
public class FamilyServImpl implements IFamilyServ{
	
	@Autowired
	IFamilyRepo iFamilyRepo;

	@Override
	public Family saveFamily(Family family) {
		// TODO Auto-generated method stub
		return iFamilyRepo.save(family);
	}

	@Override
	public Family updateFamily(Family family) {
		// TODO Auto-generated method stub
		return iFamilyRepo.saveAndFlush(family);
	}

	@Override
	public List<Family> getAllFamily() {
		// TODO Auto-generated method stub
		return iFamilyRepo.findAll();
	}

	@Override
	public void getFamily(int familyId) {
		// TODO Auto-generated method stub
		iFamilyRepo.findById(familyId);
		
	}

	@Override
	public void deleteFamily(int familyId) {
		// TODO Auto-generated method stub
		iFamilyRepo.deleteById(familyId);
		
	}

}
