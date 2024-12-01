package com.education.learningplatform.factoryMethod;

import com.education.learningplatform.entities.contents.*;


public class ContentFactory {
    public static Content createContent(String type) {
        return switch (type.toLowerCase()) {
            case "presentation" ->
                    new PresentationContent(1L, "presentation", "Java Presentation", "Presentation content");
            case "bibliography" ->
                    new BibliographyContent(1L, "bibliography", "Java Bibliography", "Bibliography content");
            case "assignment" ->
                    new AssignmentContent(1L, "assignment", "Java Assignment", "Assignment content");
            case "quiz" -> new QuizContent(1L, "quiz", "Java Quiz", "Quiz content");
            default -> throw new IllegalArgumentException("Unknown content type: " + type);
        };
    }
}
