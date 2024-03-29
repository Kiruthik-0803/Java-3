interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount implements Transaction {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class CurrentAccount implements Transaction {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class PROB4 {
    public static void main(String[] args) {
        Transaction savingsAccount = new SavingsAccount();
        Transaction currentAccount = new CurrentAccount();

        savingsAccount.deposit(1000);
        savingsAccount.withdraw(500);
        System.out.println("Savings Account Balance: $" + ((SavingsAccount) savingsAccount).getBalance());

        currentAccount.deposit(2000);
        currentAccount.withdraw(1000);
        System.out.println("Current Account Balance: $" + ((CurrentAccount) currentAccount).getBalance());
    }
}

