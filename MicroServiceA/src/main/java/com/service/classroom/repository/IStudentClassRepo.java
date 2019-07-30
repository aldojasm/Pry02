package com.service.classroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.classroom.entity.StudentClass;

@Repository
public interface IStudentClassRepo extends JpaRepository<StudentClass, Integer>{

}
