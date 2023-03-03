public class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount() {
        super();
    }

    /**
     * account number and interest rate
     */
    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calcInterest() {
        return balance * interestRate;
    }

    public void applyInterest() {
        double interest = calcInterest();
        System.out.printf("Interest amount %.2f added to balance%n", interest);
        deposit(interest);
    }

    /**
     * Function to deposit funds into the account as long as the amount parameter is> 0
     * Apply Transaction fee for the CheckingAccount
     */
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);
            System.out.printf("Current Balance is: %.2f%n", balance);

        } else {
            System.out.println("A negative amount cannot be deposited");
        }
    }

    /**
     * Function to withdraw funds from the Account as long as
     * 1. Amount to withdraw must be > 0
     * 2. Amount to withdraw must be <= balance
     */
    public void withdraw(double amount) {

        // Same check
        if (amount > 0) {
            // Check sufficient balance
            if ((amount) <= balance) {
                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                balance -= amount;
                System.out.printf("Current Balance is: %.2f%n", balance);
            }
        } else {
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }
}
