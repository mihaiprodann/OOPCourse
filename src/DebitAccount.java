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
}
