package ru.philimonov.springcourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.philimonov.springcourse.beans.Car;
import ru.philimonov.springcourse.beans.Cat;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Car firstBeanCar = applicationContext.getBean("firstBeanCar", Car.class);
        Car secondCar = applicationContext.getBean("firstBeanCar", Car.class);
        Car secondBeanCar = applicationContext.getBean("secondBeanCar", Car.class);
        System.out.println(firstBeanCar);
        System.out.println(secondBeanCar);
        System.out.println(firstBeanCar==secondBeanCar);

        ApplicationContext context = new AnnotationConfigApplicationContext("ru.philimonov.springcourse.beans");

        Cat cat = context.getBean(Cat.class);
        System.out.println(cat.toString());
    }
}