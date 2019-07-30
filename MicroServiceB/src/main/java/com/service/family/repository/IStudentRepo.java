package com.service.family.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.family.entity.Student;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Integer>{

}
