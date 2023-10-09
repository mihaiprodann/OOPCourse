import java.time.LocalDate;

public class Client {
    private String name;
    private LocalDate bday;
    private String CNP;

    private Account[] accounts = new Account[10];

    private Address address = new Address("Slatina", 1, "Strada 1");

    public Client(String name, LocalDate bday, String CNP) {
        this.name = name;
        this.bday = bday;
        this.CNP = CNP;
    }

    public void addAccount(Account account) {
        for(int i = 0; i < accounts.length; i++) {
            if(accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
    }

    public boolean removeAcount(String IBAN) {
        for(int i = 0; i < accounts.length; i++) {
            if(accounts[i] != null && accounts[i].getIBAN().equals(IBAN)) {
                accounts[i] = null;
                return true;
            }
        }
        return false;
    }

}
