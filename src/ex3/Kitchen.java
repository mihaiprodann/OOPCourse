package ex3;

import java.util.LinkedList;
import java.util.Queue;

class Kitchen {
    private Queue<Pizza> pizzas = new LinkedList<>();
    public synchronized void addPizza(Pizza pizza) {
        pizzas.add(pizza);
        System.out.println("Pizza nr " + pizza.getId() + " was added");
        try {
            Thread.sleep(5 + pizza.getNumberOfIngredients() * 2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public synchronized Pizza removePizza() {
        Pizza pizza = pizzas.poll();
        if (pizza != null) {
            System.out.println("Pizza nr " + pizza.getId() + " was removed");
        }
        return pizza;
    }
}
