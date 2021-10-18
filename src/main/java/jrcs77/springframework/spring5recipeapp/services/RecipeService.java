package jrcs77.springframework.spring5recipeapp.services;

import jrcs77.springframework.spring5recipeapp.domain.Recipe;
import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();
}
