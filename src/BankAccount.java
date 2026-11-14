public class BankAccount {

    private String ownerName;
    private long balance;

    public BankAccount(String ownerName, long balance){
        if (balance < 0) {
            throw new InvalidAmountException(
                    "Initial balance cannot be negative");
        }
        if (ownerName == null || ownerName.isBlank()){
            throw new IllegalArgumentException("Invalid ownerName");
        }
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(long amount){

        System.out.println("Deposit: " + amount);

        if (amount <= 0){
            throw new InvalidAmountException("Amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(long amount){

        System.out.println("Withdraw: " + amount);

        if (amount <= 0){
            throw new InvalidAmountException("Amount must be positive");
        }
        if (amount > balance){
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public long getBalance() {
        return balance;
    }
}
