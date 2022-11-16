package tdd;

public class Account {
    private int balance;
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
        }
    }

    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount) {
        if (amount < balance) {
            this.balance = balance - amount;
        }
    }

    /*public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public int getBalance() {
        return balance;
    }*/
}