
package com.example.coursemanagement.entity;
import com.example.coursemanagement.entity.Student;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Course {
    @Id @GeneratedValue
    private Long id;
    private String title;

    @ManyToOne
    private Instructor instructor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToMany
    @JoinTable(
            name = "course_student",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )


    private List<Student> students = new ArrayList<>();
}

