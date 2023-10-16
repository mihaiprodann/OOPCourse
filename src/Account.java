import java.io.*;

public abstract class Account implements Comparable {
    private String IBAN;
    private int ammount;

    public Account(String IBAN, int ammount) {
        this.IBAN = IBAN;
        this.ammount = ammount;
    }

    @Override
    public int compareTo(Object o) {
        Account a = (Account) o;
        if (getIBAN().compareTo(a.getIBAN()) != 0)
            return getIBAN().compareTo(a.getIBAN());

        return getAmmount() - a.getAmmount();
    }


    public int getAmmount() {
        return ammount;
    }

    protected void setAmmount(int ammount) {
        this.ammount = ammount;
    }
    abstract boolean withdraw(int ammount);

    public void deposit(int ammount) {
        this.ammount += ammount;
    }

    public String getIBAN() {
        return IBAN;
    }

    @Override
    public String toString() {
        return "IBAN: " + IBAN + ", Amount: " + ammount;
    }
}
