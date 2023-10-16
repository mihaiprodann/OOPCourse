public class DebitAccount extends Account{
    public DebitAccount(String IBAN, int ammount) {
        super(IBAN, ammount);
    }

    @Override
    public boolean withdraw(int ammount) {
        if(ammount > getAmmount()) {
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
