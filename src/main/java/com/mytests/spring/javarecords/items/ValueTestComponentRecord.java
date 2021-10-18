package com.mytests.spring.javarecords.items;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 10/18/2021.</p>
 * <p>Project: spring-java-records</p>
 * *
 */
// https://youtrack.jetbrains.com/issue/IDEA-280582 - error should be shown for @Value parameter
@Component
public record ValueTestComponentRecord(
      //  @Value("${foo.bar.default-discount}") String d
) {
}
