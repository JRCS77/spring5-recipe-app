package jrcs77.springframework.spring5recipeapp.controllers;

import jrcs77.springframework.spring5recipeapp.domain.Category;
import jrcs77.springframework.spring5recipeapp.domain.UnitOfMeasure;
import jrcs77.springframework.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    /*private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    //Constructors for automatic dependency injection
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is" + categoryOptional.get().getId());
        System.out.println("UOM Id is" + unitOfMeasureOptional.get().getId());

        return "index"; //return "index" must be the same as the folder´s name
    }*/

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes()); //in index.html: <tr th:each="recipe : ${recipes}">

        return "index"; //return "index" must be the same as the folder´s name
    }
}
