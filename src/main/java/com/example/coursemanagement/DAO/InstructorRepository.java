package com.example.coursemanagement.DAO;

import com.example.coursemanagement.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {}