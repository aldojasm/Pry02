package com.service.family.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.family.entity.Family;

@Repository
public interface IFamilyRepo extends JpaRepository<Family, Integer> {

}
