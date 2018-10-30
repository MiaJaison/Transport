package com.company;

import java.util.Arrays;
import java.util.List;

import static com.company.Gender.MALE;
import static com.company.Gender.FEMALE;
import static com.company.PrintUtils.printDelimiter;

public class TestPerson {

    public static void main(String[] args) {

        // test filterPersonsByGenderAndAge method from Person
        List<Person> students = Arrays.asList(
                new Person("Vasea", 33, MALE),
                new Person("Ann", 18, FEMALE),
                new Person("Petru", 28, MALE),
                new Person("Olga", 22, FEMALE)
        );

        printDelimiter('*');

        System.out.println(Person.filterPersonsByGenderAndAge(students, MALE, Person.LEGAL_AGE));
        System.out.println(Person.filterPersonsByGenderAndAge(students, FEMALE, Person.LEGAL_AGE));

        printDelimiter('*');
    }
}
