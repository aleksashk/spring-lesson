package ru.philimonov.springcourse.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException {
//        Method[] methods = Arrays.class.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }
//
        Runnable runnable = new Runnable(){
            public void run(){
                System.out.println("Hello world");
            }
        };
        System.out.println(runnable.getClass().getName());
        Runnable runnable1 = runnable.getClass().newInstance();
        System.out.println(runnable1);

        Shape shape = new Shape();
        Field square = shape.getClass().getDeclaredField("square");
        square.setAccessible(true);
        square.set(shape, 5);
        System.out.println(square.get(shape));

    }
}
