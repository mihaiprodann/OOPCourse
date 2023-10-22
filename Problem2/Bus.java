public class Bus extends Vehicle implements Taxable {
    public Bus(double basePrice, String name, String country) {
        super(basePrice, name, country);
    }

    public double computeRoadTax() {
        return 0.04 * getBasePrice();
    }

    public String toString() {
        return "[BUS] Total Tax: " + computeRoadTax() + " | Base price: " + getBasePrice();
    }
}
