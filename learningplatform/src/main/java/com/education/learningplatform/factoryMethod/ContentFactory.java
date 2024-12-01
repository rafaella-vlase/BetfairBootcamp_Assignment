package com.education.learningplatform.factoryMethod;

import com.education.learningplatform.entities.contents.*;


public class ContentFactory {
    public static Content createContent(String type) {
        return switch (type.toLowerCase()) {
            case "presentation" -> new PresentationContent();
            case "bibliography" -> new BibliographyContent();
            case "assignment" -> new AssignmentContent();
            case "quiz" -> new QuizContent();
            default -> throw new IllegalArgumentException("Unknown content type: " + type);
        };
    }
}
