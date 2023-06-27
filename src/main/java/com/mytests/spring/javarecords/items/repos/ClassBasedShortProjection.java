package com.mytests.spring.javarecords.items.repos;

/**
 * *
 * <p>Created by irina on 4/13/2023.</p>
 * <p>Project: spring-java-records</p>
 * *
 */
public class ClassBasedShortProjection {
    short arg1;
    Short arg2;

    public ClassBasedShortProjection(short arg1, Short arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    public String toString() {
        return "ClassBasedShortProjection{" +
                "arg1=" + arg1 +
                ", arg2=" + arg2 +
                '}';
    }
}
