package pro.sky.hw.service;
import pro.sky.hw.model.Recipe;
import java.util.Map;

public interface RecipeService {
    Long addNewRecipe(Recipe recipe);
    Recipe getRecipe(Long idRec);

    Map<Long, Recipe> getAllRecipe();

    Recipe putRecipe(Long idRec, Recipe recipe);

    boolean deleteRecipe(Long idRec);


    boolean deleteAllRecipe();



}