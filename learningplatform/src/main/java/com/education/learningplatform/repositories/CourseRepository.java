package com.education.learningplatform.repositories;

import com.education.learningplatform.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
