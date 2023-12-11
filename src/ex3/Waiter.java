package ex3;

class Waiter extends Thread {
    private Kitchen kitchen;
    public Waiter(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
    @Override
    public void run() {
        while (true) {
            Pizza pizza = kitchen.removePizza();
            if (pizza != null) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
