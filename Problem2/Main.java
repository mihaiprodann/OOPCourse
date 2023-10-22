import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Truck(30000, "Truck Manufacturer", "USA"),
                new Bus(25000, "Bus Manufacturer", "Germany"),
                new Minibus(15000, "Minibus Manufacturer", "France"),
                new Bus(10000, "Bus", "Romania"),
                new Minibus(10300, "Minibus", "Romania"),
                new Truck(12300, "Truck", "Romania"),
                new Bus(10450, "Bus", "Germany"),
                new Minibus(10790, "Minibus", "Germany"),
        };

        System.out.println("\n\n\nUnsorted vehicles:\n----------------------------------------");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        Arrays.sort(vehicles);
        System.out.println("\n\n\nSorted vehicles:\n----------------------------------------");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
