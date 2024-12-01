package com.education.learningplatform.entities.contents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BibliographyContent implements Content{
    private Long id;
    private String type = "bibliography";
    private String title;
    private String description;

    @Override
    public String getContentDetails() {
        return "This is a Java Bibliography";
    }
}
