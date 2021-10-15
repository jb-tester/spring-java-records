package com.mytests.spring.javarecords.items;

import com.mytests.spring.javarecords.items.repos.ClassBasedItemProjection;
import com.mytests.spring.javarecords.items.repos.ItemProjection;
import com.mytests.spring.javarecords.items.repos.ItemsRepository;
import com.mytests.spring.javarecords.items.repos.RecordBasedItemProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 * <p>Created by irina on 10/15/2021.</p>
 * <p>Project: spring-java-records</p>
 * *
 */
@RestController
public class ItemsController {

    @Autowired
    private ItemsRepository itemsRepository;

    @RequestMapping("/fruits")
    public List<ItemProjection> fruits() {
        return itemsRepository.getItemsByCategory("fruits");
    }

    @RequestMapping("/fruits1")
    public List<RecordBasedItemProjection> fruits1() {
        return itemsRepository.testQuery("fruits");
    }
    @RequestMapping("/fruits2")
    public List<String> fruits2() {
        List<ClassBasedItemProjection> fruits = itemsRepository.testQuery2("fruits");
        List<String> rez = new ArrayList<>();
        for (ClassBasedItemProjection fruit : fruits) {
            rez.add(fruit.toString());
        }
        return rez;
    }
}
