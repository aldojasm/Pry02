package com.service.family.service;

import java.util.List;

import com.service.family.entity.Family;

public interface IFamilyServ {
	
	//CRUD
	Family saveFamily(Family family);
	Family updateFamily(Family family);
	List<Family> getAllFamily();
	void getFamily(int familyId);
	void deleteFamily(int familyId);

}
