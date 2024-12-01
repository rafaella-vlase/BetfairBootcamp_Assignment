package com.education.learningplatform.entities.contents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentContent implements Content{
    private Long id;
    private String type = "assignment";
    private String title;
    private String description;

    @Override
    public String getContentDetails() {
        return "This is a Java Assignment";
    }
}
