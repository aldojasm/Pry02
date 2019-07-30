package com.service.family.service;

import java.util.List;

import com.service.family.entity.Parent;

public interface IParentServ {
	
	//CRUD
	Parent saveParent(Parent parent);
	Parent updateParent(Parent parent);
	List<Parent> getAllParent();
	void getParent(int parentId);
	void deleteParent(int parentId);
	

}
