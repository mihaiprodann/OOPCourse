public class Consumer extends Thread{
    private String name;
    private SharedResource sh;

    public Consumer(String name, SharedResource sh) {
        super();
        this.name = name;
        this.sh = sh;
    }

    @Override
    public void run() {
        while (true){
            Integer i = sh.remove();
            System.out.println(i+" was removed by "+name);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
