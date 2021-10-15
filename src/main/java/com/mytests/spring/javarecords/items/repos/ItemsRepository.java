package com.mytests.spring.javarecords.items.repos;

import com.mytests.spring.javarecords.items.model.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * *
 * <p>Created by irina on 14.10.2021.</p>
 * <p>Project: spring-java-records</p>
 * *
 */
@RepositoryDefinition(domainClass = Item.class, idClass = Integer.class)
public interface ItemsRepository {
    @Query("select new com.mytests.spring.javarecords.items.repos.ItemProjection(item.title, item.cathegory, (item.price * ((100 - item.discount) /100) * item.total)) from Item item where item.cathegory= :cat")
    List<ItemProjection> getItemsByCategory(@Param("cat") String category);

    <T> T findProjectedById(Integer id, Class<T> projection);
}
