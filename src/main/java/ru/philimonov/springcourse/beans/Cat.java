package ru.philimonov.springcourse.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@PropertySource("classpath:prop.properties")
@Component
public class Cat {
    @Value("${cat.name}")
    private String name;

    @Value("${cat.age}")
    private int age;

    @Value("${cat.girls}")
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
