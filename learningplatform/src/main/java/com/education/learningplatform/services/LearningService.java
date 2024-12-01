package com.education.learningplatform.services;


import com.education.learningplatform.entities.Course;
import com.education.learningplatform.factoryMethod.ContentFactory;
import com.education.learningplatform.observer.StudentObserver;
import com.education.learningplatform.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.education.learningplatform.entities.contents.Content;

import java.util.Optional;

@Service
public class LearningService {

    @Autowired
    private CourseRepository courseRepository;

    public Content createContent(String contentType) {
        return ContentFactory.createContent(contentType);
    }

    public void notifyStudents(Long courseId, String content) {
        Optional<Course> optionalCourse = courseRepository.findById(courseId);
        if (optionalCourse.isPresent()) {
            Course course = optionalCourse.get();
            course.getStudents().forEach(student ->
                    course.addObserver(new StudentObserver(student.getName())));
            course.addContent(content);
        } else {
            throw new IllegalArgumentException("Course with id " + courseId + " not found");
        }
    }
}
