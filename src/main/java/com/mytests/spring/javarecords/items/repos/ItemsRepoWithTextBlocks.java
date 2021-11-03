package com.mytests.spring.javarecords.items.repos;

import com.mytests.spring.javarecords.items.model.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 11/2/2021.</p>
 * <p>Project: spring-java-records</p>
 * *
 */
public interface ItemsRepoWithTextBlocks extends CrudRepository<Item, Integer> {

    @Query("""
           select i from Item i
           where i.cathegory = :cat
           and i.price < :price
           and i.discount > 0
           """)
    List<Item> findByMultipleCriteria(String cat, int price);

    @Query("""
 select i from Item i
           """)
    List<Item> allItems();
}
