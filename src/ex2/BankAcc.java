package ex2;

public class BankAcc {
    private String owner;
    private double amount;

    public BankAcc(String owner, double amount) {
        this.owner = owner;
        this.amount = amount;
    }

    public String getOwner() {
        return owner;
    }

    public double getAmount() {
        return amount;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public synchronized void deposit(double amount) {
        this.amount += amount;
        System.out.println("Deposited: " + amount + "and the current balance is: " + this.amount);
    }
    public synchronized void withdraw(double amount) {
        this.amount -= amount;
        System.out.println("Whitdrew: " + amount + " and the current balance is: " + this.amount);
    }
}
