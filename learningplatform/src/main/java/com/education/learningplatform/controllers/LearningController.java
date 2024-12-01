package com.education.learningplatform.controllers;

import com.education.learningplatform.entities.contents.Content;
import com.education.learningplatform.services.LearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/learning")
public class LearningController {

    @Autowired
    private LearningService learningService;

    @GetMapping("/content/{type}")
    public Content getContent(@PathVariable String type) {
        return learningService.createContent(type);
    }

    @PostMapping("/courses/{courseId}/notification")
    public void notifyStudents(@PathVariable Long courseId, @RequestParam String content)
    {
        learningService.notifyStudents(courseId, content);
    }
}
