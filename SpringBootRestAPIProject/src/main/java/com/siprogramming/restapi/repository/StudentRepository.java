package com.siprogramming.restapi.repository;

import com.siprogramming.restapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
