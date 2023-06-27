package com.mytests.spring.javarecords.items.repos;

/**
 * *
 * <p>Created by irina on 4/13/2023.</p>
 * <p>Project: spring-java-records</p>
 * *
 */
public class ClassBasedLongsProjection {

    Long arg1;
    long arg2;


    public ClassBasedLongsProjection(Long arg1, long arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    public String toString() {
        return "ClassBasedLongsProjection{" +
                "arg1=" + arg1 +
                ", arg2=" + arg2 +
                '}';
    }
}
