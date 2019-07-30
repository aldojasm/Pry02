package com.service.classroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.classroom.entity.Classe;

@Repository
public interface IClasseRepo extends JpaRepository<Classe, Integer> {

}
