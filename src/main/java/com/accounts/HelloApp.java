package com.accounts;

import com.accounts.config.AppConfig;
import com.accounts.entities.Announcement;
import com.accounts.entities.Person;
import com.accounts.repositories.PersonService;
import com.accounts.services.AnnouncementsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonService personService=(PersonService)context.getBean("personService");
        List<Person> personList=personService.findAll();
        for(Person person:personList) {
            System.out.println(person);
        }
        Person person=personService.find(2);
        System.out.println("--------------------------------------------------------------  ");
        System.out.println(person);
        System.out.println("----------------------------UPDATE----------------------------------  ");
       /* person.setLastName("Kumar");
        personService.editPerson(person,2);
        System.out.println(person);
        System.out.println("----------------------------SAVING----------------------------------  ");
        personService.addPerson(person);*/
        /*Person p=new Person(4,"pratyush","Singh",23);
        personService.addPerson(p);*/
    }
}
