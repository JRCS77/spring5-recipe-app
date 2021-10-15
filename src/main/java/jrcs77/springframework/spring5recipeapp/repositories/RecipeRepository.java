package jrcs77.springframework.spring5recipeapp.repositories;

import jrcs77.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

//Only data repositories for Category, Recipe and UnitOfMeasure since Notes and Ingredients have cascadeType.All from recipe which means it is gonna be adapted when Recipe is updated

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
