package com.accounts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by PRATYUSH on 19-08-2018.
 */
@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "person_id")
    private int personId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private int age;

    public Person() {

    }

    public Person(int personId, String firstName, String lastName, int age) {
        super();
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Person Id:- " + getPersonId() + " First Name:- " + getFirstName() + " Last Name:- " +
                getLastName() + " Age:- " + getAge());
        return builder.toString();
    }
}
