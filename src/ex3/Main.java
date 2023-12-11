package ex3;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        for (int i = 0; i < 4; i++) {//4 bucatari
            Cook cook = new Cook(kitchen);
            cook.start();
        }
        for (int i = 0; i < 4; i++) {//4 ospatari
            Waiter waiter = new Waiter(kitchen);
            waiter.start();
        }
    }
}
