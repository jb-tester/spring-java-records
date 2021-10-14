package com.mytests.spring.javarecords.contacts.repos;

import com.mytests.spring.javarecords.contacts.model.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 14.10.2021.</p>
 * <p>Project: spring-java-records</p>
 * *
 */
public interface ContactRepositoryNamesInterface extends CrudRepository<Contact,Integer> {
    
   
    List<NamesInterface> getByFirstnameNotContaining(String firstname);
}
