package com.education.learningplatform.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StudentObserver implements Observer{
    private String name;

    @Override
    public void update(String message) {
        System.out.println(name + ", " + "here's new content for you: " + message);
    }
}
