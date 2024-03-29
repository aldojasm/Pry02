package com.service.classroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.classroom.entity.Subject;

@Repository
public interface ISubjectRepo extends JpaRepository<Subject, Integer> {

}
