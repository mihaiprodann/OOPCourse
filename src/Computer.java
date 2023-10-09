public class Computer {

    private int ram;
    private String cpu;

    SoftwareProduct sp[] = new SoftwareProduct[10];

    public Computer(int ram, String cpu) {
        if(ram != 4 || ram != 8 || ram != 16 || ram != 32) {
            System.out.println("Invalid RAM");
            System.exit(0);
        }
        if(cpu != "i3" || cpu != "i5" || cpu != "i7") {
            System.out.println("Invalid CPU");
            System.exit(0);
        }
        this.ram = ram;
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public boolean addProduct(SoftwareProduct sp) {
        for(int i = 0; i < this.sp.length; i++) {
            if(this.sp[i] == null) {
                this.sp[i] = sp;
                return true;
            }
        }
        return false;
    }
}
