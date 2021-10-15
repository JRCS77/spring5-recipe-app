package jrcs77.springframework.spring5recipeapp.repositories;

import jrcs77.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//Only data repositories for Category, Recipe and UnitOfMeasure since Notes and Ingredients have cascadeType.All from recipe which means it is gonna be adapted when Recipe is updated

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription (String description); //Dynamic finders or Query methods for looking up at the data
}
