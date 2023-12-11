package ex3;

import java.util.Random;

class Cook extends Thread {
    private Kitchen kitchen;
    public Cook(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
    @Override
    public void run() {
        Random random = new Random();
        while (true){
            int numberOfIngredients = random.nextInt(5) ;
            Pizza pizza = new Pizza(numberOfIngredients);
            kitchen.addPizza(pizza);
        }
    }
}
