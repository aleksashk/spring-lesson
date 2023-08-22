package ru.philimonov.springcourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.philimonov.springcourse.beans.Car;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Car firstBeanCar = applicationContext.getBean("firstBeanCar", Car.class);
        System.out.println(firstBeanCar);
    }
}