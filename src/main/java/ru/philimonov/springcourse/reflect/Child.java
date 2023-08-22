package ru.philimonov.springcourse.reflect;

public class Child extends Parent {
    @Override
    public void sayHello() {
        System.out.println("Hello from child");
    }
}
