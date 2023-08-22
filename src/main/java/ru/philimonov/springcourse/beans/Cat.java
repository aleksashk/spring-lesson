package ru.philimonov.springcourse.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Cat {
    @Value("Boris")
    private String name;

    @Value("2")
    private int age;

    @Value(value = "#{'Mahsa,Lisa'.split(',')}")
    private List<String> girls;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", girls=" + girls +
                '}';
    }
}
