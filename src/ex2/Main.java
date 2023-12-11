package ex2;

public class Main {
    public static void main(String[] args) {
        BankAcc acc = new BankAcc("Andreea", 1200);
        Thread depositThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    acc.deposit(100);

                    try {
                        Thread.sleep(1000); // delay pt deposit
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });
        depositThread1.start();

        Thread depositThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                 while (true){
                    acc.deposit(10);
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
                         throw new RuntimeException(e);
                     }

                 }
            }
        });
        depositThread2.start();

        Thread removeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    acc.withdraw(50);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });
        removeThread.start();
    }
}
