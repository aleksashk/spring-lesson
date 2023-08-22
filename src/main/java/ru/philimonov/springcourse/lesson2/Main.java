package ru.philimonov.springcourse.lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.philimonov.springcourse.beans.House;
import ru.philimonov.springcourse.beans.Person;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configSecondLesson.xml");
        House house = context.getBean("house", House.class);
        System.out.println(house);

        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
