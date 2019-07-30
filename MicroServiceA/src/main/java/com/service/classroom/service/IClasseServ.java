package com.service.classroom.service;

import java.util.List;

import com.service.classroom.entity.Classe;

public interface IClasseServ {
	
	//CRUD
	Classe saveClasse(Classe classe);
	Classe updateClasse(Classe classe);
	List<Classe> getAllClasse();
	void getClasse(int classeId);
	void deleteClasse(int classeId);
	
	

}
