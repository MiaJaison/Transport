package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    public static final int LEGAL_AGE = 18;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 150;

    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static List<Person> filterPersonsByGenderAndAge(List<Person> personList, Gender gender, int age) {
        return personList.stream()
                .filter(person -> person.gender == gender && person.age >= age)
                .collect(Collectors.toList());
    }

    public static List<Person> filterPersonsByAge(List<Person> personList, int age) {
        return personList.stream()
                .filter(person -> person.age >= age)
                .collect(Collectors.toList());
    }

    public static List<Person> filterPersonsByGenderAndAgeOldStyle(List<Person> personList, Gender gender, int age) {
        // old implementation would be
        List<Person> filteredPersonList = new ArrayList<>();
        for (Person person : personList) {
            if (person.gender == gender && person.age >= age) {
                filteredPersonList.add(person);
            }
        }
        return filteredPersonList;
    }
}
