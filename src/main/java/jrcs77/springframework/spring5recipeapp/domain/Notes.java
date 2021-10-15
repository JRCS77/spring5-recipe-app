package jrcs77.springframework.spring5recipeapp.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Persistance
    private Long id;

    @OneToOne // cascade = CascadeType not needed because the class Recipe owns Notes, i.e. if we delete the notes object,  the recipe object remains inside the database
    private Recipe recipe;

    @Lob //In order to write large Objects in the Notes field in JPA and Hibernate
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
