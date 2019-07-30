package com.service.family.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.family.entity.Parent;

@Repository
public interface IParentRepo extends JpaRepository<Parent, Integer>{

}
