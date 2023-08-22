package ru.philimonov.springcourse.reflect.context;

@Component(name = "house")
public class House {

    public void sayHello() {
        System.out.println("Hello from house");
    }
}
