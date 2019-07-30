package com.service.classroom.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.classroom.entity.Classe;
import com.service.classroom.service.IClasseServ;

@RestController
public class ClasseCont {
		
		@Autowired
		private IClasseServ iClasseServ;
		
		@PostMapping("/clas/save")
		public Classe Save(@RequestBody Classe classe) {
			return iClasseServ.saveClasse(classe);
		}
		
		@PutMapping("/clas/update")
		public Classe Update(@RequestBody Classe classe) {
			return iClasseServ.updateClasse(classe);
		}
		
		@DeleteMapping("/clas/delete")
		public void Delete(int classeId) {
			iClasseServ.deleteClasse(classeId);
		}
		
		@GetMapping("/clas/all")
		public List<Classe> getAllClasses(){
			return iClasseServ.getAllClasse();
		}
		
		@GetMapping("/clas/get/{id}")
		public void getClasse(int classeId) {
			iClasseServ.getClasse(classeId);
		}

}
