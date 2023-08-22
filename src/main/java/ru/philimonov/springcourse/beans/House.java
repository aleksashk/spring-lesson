package ru.philimonov.springcourse.beans;

import ru.philimonov.springcourse.beans.Address;
import ru.philimonov.springcourse.reflect.context.Component;

public class House {
    private int countOfFloors;
    private int countOfFlats;
    private Address address;

    public House() {
    }

    public int getCountOfFloors() {
        return countOfFloors;
    }

    public void setCountOfFloors(int countOfFloors) {
        this.countOfFloors = countOfFloors;
    }

    public int getCountOfFlats() {
        return countOfFlats;
    }

    public void setCountOfFlats(int countOfFlats) {
        this.countOfFlats = countOfFlats;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "countOfFloors=" + countOfFloors +
                ", countOfFlats=" + countOfFlats +
                ", address=" + address +
                '}';
    }
}
