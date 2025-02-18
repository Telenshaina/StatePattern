//account state

public class ActiveState implements AccountState {
    private Account account;

    public ActiveState(Account account) {
        this.account = account;
    }

    public ActiveState() {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(double amount) {
        double newBalance = Math.max(0, account.getBalance() - amount); // Key change!
        account.setBalance(newBalance);
        System.out.println(account);
    }

    @Override
    public void activate() {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend() {
        account.setState(new SuspendedState(account));
        System.out.println("Account is suspended!");
    }

    @Override
    public void close() {
        account.setState(new ClosedState(account));
        System.out.println("Account is closed!");
    }

    @Override
    public String toString() {
        return "Active";
    }
}