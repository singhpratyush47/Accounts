package com.accounts.dao;

import com.accounts.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by PRATYUSH on 19-08-2018.
 */
@Repository
@Qualifier("personDao")
public class PersonDaoImpl implements PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void addPerson(Person person) {

        jdbcTemplate.update("INSERT INTO person (person_id, first_name, Last_name, age) VALUES (?, ?, ?, ?)",
                person.getPersonId(),person.getFirstName(),person.getLastName(),person.getAge());
        System.out.println("Person Added!!");
    }

    @Override
    public void editPerson(Person person, int personId) {

        jdbcTemplate.update("UPDATE person SET first_name = ? , last_name = ? , age = ? WHERE person_id = ? ",
                person.getFirstName(),person.getLastName(),person.getAge(),personId);
        System.out.println("Edited Successfully!!");
    }

    @Override
    public void deletePerson(int personId) {

        jdbcTemplate.update("DELETE from person WHERE person_id = ?",personId);
        System.out.println("Deleted Successfully!!");
    }

    @Override
    public Person find(int personId) {
        Person person=(Person)jdbcTemplate.queryForObject("SELECT * FROM person where person_id = ?",
                new Object[]{personId}, new BeanPropertyRowMapper(Person.class));
        return person;
    }

    @Override
    public List<Person> findAll() {
        List<Person> persons=jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
        return persons;
    }
}
