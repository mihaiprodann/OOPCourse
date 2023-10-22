public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Bus(10000, "Bus", "Romania"),
                new Minibus(10000, "Minibus", "Romania"),
                new Truck(10000, "Truck", "Romania"),
                new Bus(10000, "Bus", "Germany"),
                new Minibus(10000, "Minibus", "Germany"),
                new Truck(10000, "Truck", "Germany"),
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            System.out.println("VAT: " + vehicle.computeVAT());
            System.out.println("Road tax: " + vehicle.computeRoadTax());
            System.out.println("Custom tax: " + vehicle.computeCustomTax());
            System.out.println("Total tax: " + vehicle.computeTotalTax());
            System.out.println("----------------------------------------");
        }
    }
}
