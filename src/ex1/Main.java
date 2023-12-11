package ex1;

public class Main {
    public static void main(String[] args) {
        TimePrinter timePrinter = new TimePrinter();

        Thread thread1 = new Thread(timePrinter);
        Thread thread2 = new Thread(timePrinter);
        Thread thread3 = new Thread(timePrinter);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

