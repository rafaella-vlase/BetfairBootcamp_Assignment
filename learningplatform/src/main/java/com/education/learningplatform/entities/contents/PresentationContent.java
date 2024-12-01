package com.education.learningplatform.entities.contents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PresentationContent implements Content{
    private Long id;
    private String type = "presentation";
    private String title;
    private String description;

    @Override
    public String getContentDetails() {
        return "This is a Java Presentation";
    }
}
