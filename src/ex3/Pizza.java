package ex3;

public class Pizza {
    private static int nextId = 1;
    private int id;
    private int numberOfIngredients;

    public Pizza(int numberOfIngredients) {
        this.id = nextId++;
        this.numberOfIngredients = numberOfIngredients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }

    public void setNumberOfIngredients(int numberOfIngredients) {
        this.numberOfIngredients = numberOfIngredients;
    }
}
