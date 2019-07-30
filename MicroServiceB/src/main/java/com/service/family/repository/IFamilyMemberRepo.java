package com.service.family.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.family.entity.FamilyMember;

@Repository
public interface IFamilyMemberRepo extends JpaRepository<FamilyMember, Integer> {

}
