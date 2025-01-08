public class BankAccount {
    private int accountNumber;
    private String accountholder;
    private double balance;

    public BankAccount(int a, String h) {
        accountNumber = a;
        accountholder = h;
    }

    public void setAccountHolder(String h) {
        accountholder = h;
    }

    public void setAccountNumber(int a) {
        accountNumber = a;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public String getAccountholder() {
        return accountholder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
}
