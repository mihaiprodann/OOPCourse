public class Loan {
    private int id;
    private double amount;

    private Person person;

    public Loan(int id, double amount, Person person) {
        this.id = id;
        this.amount = amount;
        this.person = person;
    }

    public void increaseAmount(double added) {
        this.amount += added;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.person.getName() + " " + this.person.getSurname();
    }

    public double getAmount() {
        return this.amount;
    }
}
