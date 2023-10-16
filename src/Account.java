import java.io.*;

public class Account implements Comparable, Storable {
    private String IBAN;
    private int ammount;

    public Account(String IBAN, int ammount) {
        this.IBAN = IBAN;
        this.ammount = ammount;
    }

    public int compareTo(Object aThat){
        if (this == aThat)
            return 0;
        Account a = (Account) aThat;
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
    public void store(String filename) {
        try
        {
            FileWriter fw = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(this.toString());
            bw.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "IBAN: " + IBAN + ", Amount: " + ammount;
    }

}