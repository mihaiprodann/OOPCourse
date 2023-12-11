package ex1;

import java.util.Date;
public class TimePrinter implements Runnable{
    public void run(){
        while (true) {
                System.out.println("Current time: " + new Date());
            try {
                Thread.sleep(10000); //asteaota 10 sec
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
