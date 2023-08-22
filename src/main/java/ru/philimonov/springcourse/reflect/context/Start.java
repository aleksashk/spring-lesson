package ru.philimonov.springcourse.reflect.context;

import ru.philimonov.springcourse.beans.House;

public class Start {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ApplicationContext context = new AnnotationAppContext(House.class);

//        House house = (House) context.getBean("house");
//        house.sayHello();
    }
}
