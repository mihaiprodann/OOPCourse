public class SoftwareProduct {
    private String name;
    private String platform;
    private int minRAM;

    private String minCPU;

    public boolean checkCompatibility(Computer c) {
        if(c.getRam() < minRAM) {
            return false;
        }

        if(c.getCpu() == "i3" && minCPU.equals("i5") || minCPU.equals("i7")) {
            return false;
        }

        if(c.getCpu() == "i5" && minCPU.equals("i7")) {
            return false;
        }

        return true;
    }
}
