package com.education.learningplatform.entities;

import java.util.*;

import com.education.learningplatform.observer.Observable;
import jakarta.persistence.*;
import lombok.*;
import com.education.learningplatform.observer.Observer;

@Entity
@Getter
@Setter
public class Course implements Observable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) //facilitates removal of learners in case of Course removal
    private List<Student> students = new ArrayList<>();

    @Transient
    private List<Observer> observers = new ArrayList<>();

    public void addContent(String content) {
        notifyObservers("New content added to " + name + ": " + content);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
