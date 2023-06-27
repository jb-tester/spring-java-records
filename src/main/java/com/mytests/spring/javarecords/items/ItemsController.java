package com.mytests.spring.javarecords.items;

import com.mytests.spring.javarecords.items.repos.*;
import org.springframework.beans.factory.annotation.Value;
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


    private String category ;

    private final ItemsRepository itemsRepository;

    public ItemsController(ItemsRepository itemsRepository,  @Value("${foo.bar.category}") String category) {
        this.itemsRepository = itemsRepository;
        this.category = category;
    }

    @RequestMapping("/fruits")
    public List<ItemProjection> fruits() {
        return itemsRepository.getItemsByCategory(category);
    }

    @RequestMapping("/fruits1")
    public List<RecordBasedItemProjection> fruits1() {
        return itemsRepository.testQuery(category);
    }
    @RequestMapping("/fruits2")
    public List<String> fruits2() {
        List<ClassBasedItemProjection> fruits = itemsRepository.testQuery2(this.category);
        List<String> rez = new ArrayList<>();
        for (ClassBasedItemProjection fruit : fruits) {
            rez.add(fruit.toString());
        }
        return rez;
    }

   @RequestMapping("/testLongsCasting")
    public String testLongsCasting() {
        String rez = " ";
        for (ClassBasedLongsProjection p : itemsRepository.testCastsForLongs()) {
            rez = rez + p + " ";
        }
        return rez;
    }
    @RequestMapping("/testShortsCasting2")
    public String testShortsCasting2() {
        String rez = " ";
        for (ClassBasedShortProjection p : itemsRepository.testCastForShorts()) {
            rez = rez + p + " ";
        }
        return rez;
    }
}
