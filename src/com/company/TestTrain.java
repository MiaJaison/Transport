package com.company;

import java.util.Arrays;
import java.util.List;

import static com.company.Gender.FEMALE;
import static com.company.Gender.MALE;

public class TestTrain {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Vasea", 33, MALE),
                new Person("Ann", 18, FEMALE),
                new Person("Petru", 28, MALE),
                new Person("Olga", 22, FEMALE)
        );


        List<Carriage> carriages = Arrays.asList(
                new Carriage(1, 20, persons, CarriageClass.FC ),
                new Carriage(2, 25, persons, CarriageClass.RK ),
                new Carriage(3, 30, persons, CarriageClass.SC ),
                new Carriage(4, 35, persons, CarriageClass.SL ),
                new Carriage(5, 35, persons, CarriageClass.FC )
        );

        System.out.println( new Train("MD-001", "Maldive", carriages, new Person("Vasea", 56, Gender.MALE)));
    }

}
