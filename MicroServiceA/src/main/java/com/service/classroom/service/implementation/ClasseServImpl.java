package com.service.classroom.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.classroom.entity.Classe;
import com.service.classroom.repository.IClasseRepo;
import com.service.classroom.service.IClasseServ;

@Service
public class ClasseServImpl implements IClasseServ{
	
	@Autowired
	IClasseRepo iClasseRepo;

	@Override
	public Classe saveClasse(Classe classe) {
		// TODO Auto-generated method stub
		return iClasseRepo.save(classe);
	}

	@Override
	public Classe updateClasse(Classe classe) {
		// TODO Auto-generated method stub
		return iClasseRepo.saveAndFlush(classe);
	}

	@Override
	public List<Classe> getAllClasse() {
		// TODO Auto-generated method stub
		return iClasseRepo.findAll();
	}

	@Override
	public void getClasse(int classeId) {
		// TODO Auto-generated method stub
		iClasseRepo.findById(classeId);
		
	}

	@Override
	public void deleteClasse(int classeId) {
		// TODO Auto-generated method stub
		iClasseRepo.deleteById(classeId);
		
	}

}
