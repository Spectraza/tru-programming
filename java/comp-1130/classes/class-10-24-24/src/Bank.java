public class Bank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1, "Someone");

        acc1.setBalance(3000);

        System.out.println("Account name: " + acc1.getAccountholder());
        System.out.println("Account balance: " + acc1.getBalance());

        acc1.deposit(8972497);
        System.out.println("Update 1 from deposition");
        System.out.println("Account balance: " + acc1.getBalance());

        acc1.withdraw(3434);
        System.out.println("Update 2 from withdraw");
        System.out.println("Account balance: " + acc1.getBalance());
    }
}
