public abstract class Vehicle implements Taxable, Comparable {
    private double basePrice;
    private String name;
    private String country;

    public Vehicle(double basePrice, String name, String country) {
        this.basePrice = basePrice;
        this.name = name;
        this.country = country;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double computeVAT() {
        return basePrice * 0.19;
    }

    public double computeCustomTax() {
        if (!this.country.equals("Romania"))
            return basePrice * 0.1;
        return 0;
    }

    public double computeTotalTax() {
        return computeVAT() + computeRoadTax() + computeCustomTax();
    }

    @Override
    public int compareTo(Object o) {
        Vehicle v = (Vehicle) o;
        if (this.computeTotalTax() < v.computeTotalTax())
            return -1;
        if (this.computeTotalTax() > v.computeTotalTax())
            return 1;
        if (this.computeTotalTax() == v.computeTotalTax()) {
            if (this.getBasePrice() < v.getBasePrice())
                return 1;
            if (this.getBasePrice() > v.getBasePrice())
                return -1;
            return 0;
        }
        return 0;
    }

}
