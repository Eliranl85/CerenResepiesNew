package il.co.beeart.cerenresepies;

public class Recipe {

    private String name;
    private String body;
    Integer recipeImage;

    public Recipe(String name, String body) {
        this.name = name;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getRecipeImage() {
        return recipeImage;
    }

    public void setRecipeImage(Integer recipeImage) {
        this.recipeImage = recipeImage;
    }
}
