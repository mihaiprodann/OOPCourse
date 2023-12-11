import java.util.Random;

public class Producer extends Thread{
    private String name;
    private SharedResource sh;



    public Producer(String name, SharedResource sh) {
        super();
        this.name = name;
        this.sh = sh;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true){
            Integer i = r.nextInt(100);
            sh.add(i);
            System.out.println(i+" was added by "+name);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
