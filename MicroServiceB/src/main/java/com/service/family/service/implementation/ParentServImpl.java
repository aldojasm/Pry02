package com.service.family.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.family.entity.Parent;
import com.service.family.repository.IParentRepo;
import com.service.family.service.IParentServ;

@Service
public class ParentServImpl implements IParentServ{
	
	@Autowired
	IParentRepo iParentRepo;

	@Override
	public Parent saveParent(Parent parent) {
		// TODO Auto-generated method stub
		return iParentRepo.save(parent);
	}

	@Override
	public Parent updateParent(Parent parent) {
		// TODO Auto-generated method stub
		return iParentRepo.saveAndFlush(parent);
	}

	@Override
	public List<Parent> getAllParent() {
		// TODO Auto-generated method stub
		return iParentRepo.findAll();
	}

	@Override
	public void getParent(int parentId) {
		// TODO Auto-generated method stub
		iParentRepo.findById(parentId);
		
	}

	@Override
	public void deleteParent(int parentId) {
		// TODO Auto-generated method stub
		iParentRepo.deleteById(parentId);
		
	}

	
}
