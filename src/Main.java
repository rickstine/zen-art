public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(100);
        account.deposit(50);
        boolean success = account.withdraw(30);
        System.out.println("Current balance:" + account.getBalance());
        System.out.println("Withdraw successful:" + success);
    }
}