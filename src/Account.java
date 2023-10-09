public abstract class Account {
    private String IBAN;
    private int ammount;

    public Account(String IBAN, int ammount) {
        this.IBAN = IBAN;
        this.ammount = ammount;
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
}
