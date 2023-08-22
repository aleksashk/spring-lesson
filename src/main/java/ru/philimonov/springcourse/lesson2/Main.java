package ru.philimonov.springcourse.lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.philimonov.springcourse.beans.Address;
import ru.philimonov.springcourse.beans.House;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configSecondLesson.xml");
        Address address = new Address("Mira", 23);

        House house = context.getBean("house", House.class);
        house.setAddress(address);
        System.out.println(house);
    }
}
