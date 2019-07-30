package com.service.classroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.classroom.entity.Teacher;

@Repository
public interface ITeacherRepo extends JpaRepository<Teacher, Integer> {

}
