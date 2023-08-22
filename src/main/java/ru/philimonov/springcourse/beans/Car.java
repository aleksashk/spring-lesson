package ru.philimonov.springcourse.beans;

public class Car {
    private int speed;

    private String mark;

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
                '}';
    }
}
