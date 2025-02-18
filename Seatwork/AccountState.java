// interface
public interface AccountState{
    public void deposit(double amount);
    public void withdraw(double amount);
    public void activate();
    public void suspend();
    public void close();
    String toString(); 
}
