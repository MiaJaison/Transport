package com.company;

import java.util.List;

public class Train {
    String name;
    String destination;
    Person driver;
    private List<Carriage> carriages;

    public Train(String name, String destination, List<Carriage> carriages, Person driver) {
        this.name = name;
        this.destination = destination;
        this.carriages = carriages;
        this.driver = driver;
    }

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

    public List<Carriage> getCarriages() {
        return carriages;
    }

    public void setCarriages(List<Carriage> carriages) {
        this.carriages = carriages;
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", driver=" + driver +
                ", carriages=" + carriages +
                '}';
    }

}
