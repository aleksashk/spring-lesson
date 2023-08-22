package ru.philimonov.springcourse.reflect;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
    public static void main(String[] args) {
        Method[] methods = Arrays.class.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }


    }
}
