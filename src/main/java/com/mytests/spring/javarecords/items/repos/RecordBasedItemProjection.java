package com.mytests.spring.javarecords.items.repos;

import com.mytests.spring.javarecords.items.model.Item;

/**
 * *
 * <p>Created by irina on 10/15/2021.</p>
 * <p>Project: spring-java-records</p>
 * *
 */
public record RecordBasedItemProjection(Item item, Long totalsum) {
}
