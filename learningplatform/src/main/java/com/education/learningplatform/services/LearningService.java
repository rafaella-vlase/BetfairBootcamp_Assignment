package com.education.learningplatform.services;


import com.education.learningplatform.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LearningService {

    @Autowired
    private CourseRepository courseRepository;
}
