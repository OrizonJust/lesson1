package edu.laverno.dao;

import edu.laverno.domain.Person;

public class PersonDAOSimple implements PersonDAO {

    private int age;

    @Override
    public Person findByName(String name) {
        return new Person(name, age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
