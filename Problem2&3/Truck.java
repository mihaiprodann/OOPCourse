public class Truck extends Vehicle implements Taxable {
    public Truck(double basePrice, String name, String country) {
        super(basePrice, name, country);
    }
    public double computeRoadTax() {
        return 0.05 * getBasePrice();
    }

    @Override
    public String toString() {
        return "[TRUCK] Total Tax: " + computeRoadTax() + " | Base price: " + getBasePrice();
    }
}
