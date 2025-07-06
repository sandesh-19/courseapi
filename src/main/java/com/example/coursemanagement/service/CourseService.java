package com.example.coursemanagement.service;


import com.example.coursemanagement.DAO.CourseRepository;
import com.example.coursemanagement.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepo;

    public Page<Course> getAllCourses(Pageable pageable) {
        return courseRepo.findAll(pageable);
    }

    public Course createCourse(Course course) {
        return courseRepo.save(course);
    }

    public Optional<Course> getCourse(Long id) {
        return courseRepo.findById(id);
    }

    public void deleteCourse(Long id) {
        courseRepo.deleteById(id);
    }

    public Course updateCourse(Long id, Course updated) {
        Course existing = courseRepo.findById(id).orElseThrow();
        existing.setTitle(updated.getTitle());
        return courseRepo.save(existing);
    }
}


