package com.mytests.spring.javarecords;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

@SpringBootTest
class SpringJavaRecordsApplicationTests {

    @Autowired
    EntityManager entityManager;

    @Test
    void testQuery1() {

        Long summa = entityManager
                .createQuery("select sum(i.price * i.total) from Item i where i.cathegory=:cat", Long.class)
                .setParameter("cat", "fruits")
                .getSingleResult();
        Assertions.assertEquals(summa,550000);

    }

}
