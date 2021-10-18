package com.mytests.spring.javarecords.contacts;

import com.mytests.spring.javarecords.contacts.repos.ContactRepositoryNamesInterface;
import com.mytests.spring.javarecords.contacts.repos.ContactRepositoryNamesRecord;
import com.mytests.spring.javarecords.contacts.repos.NamesInterface;
import com.mytests.spring.javarecords.contacts.repos.NamesRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * *
 * <p>Created by irina on 14.10.2021.</p>
 * <p>Project: spring-java-records</p>
 * *
 */
@RestController
public record ContactController(ContactRepositoryNamesRecord recordRepository, ContactRepositoryNamesInterface interfaceRepository) {



    @RequestMapping("/projection_record")
    public List<NamesRecord> recordProjectionTest() {
        
        return recordRepository.findByEmailContains("@");
    }
    @RequestMapping("/projection_interface")
    public List<NamesInterface> interfaceProjectionTest() {

        return interfaceRepository.getByFirstnameNotContaining("lena");
    }
}
