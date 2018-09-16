package com.accounts.dao;

import com.accounts.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by PRATYUSH on 19-08-2018.
 */
@Repository
@Qualifier("personDao")
public class PersonDaoImpl implements PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addPerson(Person person) {
        entityManager.persist(person);
    }

    @Override
    public void editPerson(Person person, int personId) {

        entityManager.merge(person);
    }

    @Override
    public void deletePerson(int personId) {

        //Code to remove Person
    }

    @Override
    public Person find(int personId) {

        Person person = entityManager.find(Person.class, personId);
        return person;
    }

    @Override
    public List<Person> findAll() {
        return entityManager.createQuery("select person  from Person person", Person.class).getResultList();
    }
}
