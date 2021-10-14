package com.mytests.spring.javarecords;

import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 14.10.2021.</p>
 * <p>Project: spring-java-records</p>
 * *
 */
@Component
public record FooRecord(Foo1 prop1, Foo2 prop2) {
}
