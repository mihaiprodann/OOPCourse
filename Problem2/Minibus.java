public class Minibus extends Vehicle implements Taxable {

    public Minibus(double basePrice, String name, String country) {
        super(basePrice, name, country);
    }
    public double computeRoadTax() {
        return 0.03 * getBasePrice();
    }

    public String toString() {
        return "[MINIBUS] Total Tax: " + computeRoadTax() + " | Base price: " + getBasePrice();
    }
}
