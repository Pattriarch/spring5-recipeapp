package spring.framework.spring5recipeapp.services;

import spring.framework.spring5recipeapp.commands.RecipeCommand;
import spring.framework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);

    RecipeCommand findCommandById(Long l);

    void deleteById(Long l);
}
