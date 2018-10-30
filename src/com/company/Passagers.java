package com.company;

import java.util.List;

public class Passagers extends Person{
    Luggage luggage;

    public Passagers(String name, int age, Gender gender, Luggage luggage) {
        super(name, age, gender);
        this.luggage = luggage;
    }

    public Luggage getLuggage() {
        return luggage;
    }

    public void setLuggage(Luggage luggage) {
        this.luggage = luggage;
    }

    @Override
    public String toString() {
        return "Passagers{" +
                "luggage=" + luggage +
                '}';
    }
}