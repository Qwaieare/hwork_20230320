package pro.sky.hw.service;
import pro.sky.hw.model.Ingredient;

import java.util.Map;

public interface IngredientService {

    Long addNewIngredient(Ingredient ingredient);
    Ingredient getIngredient(Long idIng);

    Map<Long, Ingredient> getAllIngredient();

    Ingredient putIngredient(Long idIng, Ingredient ingredient);

    boolean deleteIngredient(Long idIng);

    boolean deleteAllIngredient();

}
