package com.accounts.dao;

import com.accounts.entities.Person;

import java.util.List;

/**
 * Created by PRATYUSH on 19-08-2018.
 */
public interface PersonDao {

    public void addPerson(Person person);

    public void editPerson(Person person, int personId);

    public void deletePerson(int personId);

    public Person find(int personId);

    public List<Person> findAll();
}
