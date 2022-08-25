package com.example.jpastarti.repository;

import com.example.jpastarti.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Integer>{
}
