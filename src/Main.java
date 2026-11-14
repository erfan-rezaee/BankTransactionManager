public class Main {
    public static void main(String[] args){

        BankAccount account = new BankAccount("Ali", 1000);
        System.out.println("========== Bank Transaction Manager ==========");
        System.out.println();
        System.out.println("Account Owner: " + account.getOwnerName());
        System.out.println("Initial Balance: " + account.getBalance());
        System.out.println();

        try {
            account.deposit(500);
            System.out.println("Deposit successful");
            System.out.println("Current Balance: " + account.getBalance());
            System.out.println();
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(200);
            System.out.println("Withdraw successful");
            System.out.println("Current Balance: " + account.getBalance());
            System.out.println();

        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(2000);
            System.out.println("Withdraw successful");
            System.out.println("Current Balance: " + account.getBalance());
            System.out.println();


        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println();

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println();
        }

        try {
            account.deposit(-100);
            System.out.println("Deposit successful");
            System.out.println("Current Balance: " + account.getBalance());
            System.out.println();

        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println();
        }
            System.out.println("Final Balance: " + account.getBalance());
            System.out.println();
            System.out.println("==============================================");
        }
    }
