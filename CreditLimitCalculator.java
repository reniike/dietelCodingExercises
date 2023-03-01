package chapterFour;

public class CreditLimitCalculator {
    private int accountNumber;
    private int balance;
    private int totalOfItemsCharged;
    private int totalOfCredit;
    private int creditLimit;
    private int newBalance;

    public CreditLimitCalculator(int accountNumber, int balance, int totalOfItemsCharged, int totalOfCredit, int creditLimit){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.totalOfItemsCharged = totalOfItemsCharged;
        this.totalOfCredit = totalOfCredit;
        this.creditLimit = creditLimit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getTotalOfItemsCharged() {
        return totalOfItemsCharged;
    }

    public int getTotalOfCredit() {
        return totalOfCredit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int newBalance() {
        int newBalance = (balance + totalOfItemsCharged) - totalOfCredit;
        return newBalance;
    }
}
