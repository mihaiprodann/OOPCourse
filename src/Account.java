import java.io.*;
import java.util.Arrays;
import java.util.Objects;
public class Account implements Comparable, Storable {
    private String IBAN;
    private int ammount;

    public Account(String IBAN, int ammount) {
        this.IBAN = IBAN;
        this.ammount = ammount;
    }

    public int compareTo(Object aThat){
        if(this==aThat) return 0;
        Account a= (Account) aThat;
        return IBAN.compareTo(a.IBAN);
    }

    public int getAmmount() {
        return ammount;
    }

    protected void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public void deposit(int ammount) {
        this.ammount += ammount;
    }

    public String getIBAN() {
        return IBAN;
    }

    @Override
    public void store(String file) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println(this);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "IBAN: " + IBAN + ", Amount: " + ammount;
    }

    public static void main(String[] args) {
        Account[] accounts={new Account("RO3533400",234),
                new Account("RO5346453",456),
                new Account("RO5467870",5684)

        };
        for(Account aThat:accounts){
            System.out.println(aThat.getIBAN());
        }
        System.out.println("---------------------");
        Arrays.sort(accounts);
        for(Account aThat: accounts){
            System.out.println(aThat.getIBAN());
        }

        Account account = new Account("123456789", 15400);
        account.store("account.txt");
        System.out.println("Account information stored in 'account.txt'");

    }

}