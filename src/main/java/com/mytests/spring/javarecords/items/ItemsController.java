package com.mytests.spring.javarecords.items;

import com.mytests.spring.javarecords.items.repos.ItemProjection;
import com.mytests.spring.javarecords.items.repos.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
