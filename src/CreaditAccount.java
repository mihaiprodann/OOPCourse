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
}
