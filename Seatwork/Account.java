public class Account{
    private AccountState accountState;
    private String accountNumber;
    private Double balance;


    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(this);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState getState() {
        return accountState;
    }

    public void setState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void deposit(double depositAmount) {
        accountState.deposit(depositAmount);
    }

    public void withdraw(double withdrawAmount) {
        accountState.withdraw(withdrawAmount);
    }

    public void suspend() {
        accountState.suspend();
    }

    public void activate() {
        accountState.activate();
    }

    public void close() {
        accountState.close();
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}