package com.accounts.services;

import com.accounts.dao.PersonDao;
import com.accounts.entities.Person;
import com.accounts.repositories.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by PRATYUSH on 19-08-2018.
 */
@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService {


    @Autowired
    PersonDao personDao;
    @Override
    public void addPerson(Person person) {

        personDao.addPerson(person);
    }

    @Override
    public void editPerson(Person person, int personId) {

        personDao.editPerson(person,personId);
    }

    @Override
    public void deletePerson(int personId) {

        personDao.deletePerson(personId);
    }

    @Override
    public Person find(int personId) {
        Person person=personDao.find(personId);
        return person;
    }

    @Override
    public List<Person> findAll() {
        List<Person> personList=personDao.findAll();
        return personList;
    }
}
