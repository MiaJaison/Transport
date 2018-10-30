package com.company;

import java.util.List;

public class Train {
    String name;
    String destination;
    Person driver;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", driver=" + driver +
                '}';
    }

    public static void main(String[] args) {
	// write your code here
    }
}
