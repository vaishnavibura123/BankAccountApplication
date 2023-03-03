public abstract class Account {
    private int accountNumber;
    protected double balance;
    public Account() {

    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0;
    }


    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }


    /**
     * Function to deposit funds into the account as long as
     * the amount parameter is > 0
     * Apply Transaction fee for the CheckingAccount
     */
    public abstract void deposit(double amount);

    /**
     * Function to withdraw funds from the Account as long as
     *  1. Amount to withdraw must be > 0
     *  2. Amount to withdraw must be <= balance

     */
    public abstract void withdraw(double amount);
}