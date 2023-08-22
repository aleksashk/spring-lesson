package ru.philimonov.springcourse.beans;

import java.util.List;

public class Car {
    private int speed;

    private String mark;

    private List<String> countries;

    public Car() {
    }

    public Car(int speed, String mark) {
        this.speed = speed;
        this.mark = mark;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", mark='" + mark + '\'' +
                ", countries=" + countries +
                '}';
    }
}
