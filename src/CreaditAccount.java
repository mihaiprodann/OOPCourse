public class CreaditAccount extends Account {
    private int maxCredit;

    public CreaditAccount(String IBAN, int ammount, int maxCredit) {
        super(IBAN, ammount);
        this.maxCredit = maxCredit;
    }


    @Override
    boolean withdraw(int ammount) {
        if(ammount > getAmmount() + maxCredit) {
            return false;
        }
        setAmmount(getAmmount() - ammount);
        return true;
    }

    public int compareTo(Object o) {
        if(this == o)
            return 0;

        Account a = (Account) o;
        if (getIBAN().compareTo(a.getIBAN()) != 0)
            return getIBAN().compareTo(a.getIBAN());

        return getAmmount() - a.getAmmount();
    }
}
