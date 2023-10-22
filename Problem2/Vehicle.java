public abstract class Vehicle implements Taxable {
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

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double computeVAT() {
        return basePrice * 0.19;
    }

    public double computeCustomTax() {
        if (this.country.equals("Romania"))
            return basePrice * 0.1;
        return 0;
    }

    public double computeTotalTax() {
        return computeVAT() + computeRoadTax() + computeCustomTax();
    }


}
