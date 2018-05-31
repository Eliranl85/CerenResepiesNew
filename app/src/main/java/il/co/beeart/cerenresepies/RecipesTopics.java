package il.co.beeart.cerenresepies;

import java.util.List;

public class RecipesTopics {

    private List<Recipe> recipes;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecipesTopics(String name) {
        this.name = name;
    }
}
