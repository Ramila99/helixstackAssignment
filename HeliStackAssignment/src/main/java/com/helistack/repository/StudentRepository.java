package com.helistack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helistack.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
