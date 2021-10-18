package com.mytests.spring.javarecords;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
// https://youtrack.jetbrains.com/issue/IDEA-226889
@ConfigurationProperties(prefix = "foo.bar")
@ConstructorBinding
public record RecordConfiguration(int defaultDiscount, String category) { }