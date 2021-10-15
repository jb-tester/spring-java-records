package com.mytests.spring.javarecords.items.repos;

import java.io.Serializable;

/**
 * *
 * <p>Created by irina on 10/15/2021.</p>
 * <p>Project: spring-java-records</p>
 * *
 */
public class ClassBasedItemProjection implements Serializable {

    String title;
    String comment;
    String cathegory;
    Integer price;

    public ClassBasedItemProjection(String title, String comment, String cathegory, Integer price) {
        this.title = title;
        this.comment = comment;
        this.cathegory = cathegory;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ClassProjection{" +
                "title='" + title + '\'' +
                ", comment='" + comment + '\'' +
                ", cathegory='" + cathegory + '\'' +
                ", price=" + price +
                '}';
    }
}
