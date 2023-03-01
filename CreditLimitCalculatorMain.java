package chapterFour;
//(Credit Limit Calculator) Develop a Java application that determines whether any of several department-store customers has exceeded the credit limit on a charge account.
//        For each customer,
//        the following facts are available:
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
//        e) allowed credit limit.
//        The program should input all these facts as integers, calculate the new balance (= beginning balance
//        + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".

import java.util.Scanner;

public class CreditLimitCalculatorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = input.nextInt();
        System.out.println("Enter your balance: ");
        int balance = input.nextInt();
        System.out.println("Enter total numbers of items charged: ");
        int charged = input.nextInt();
        System.out.println("Enter the total amount of credit: ");
        int totalOfCredit = input.nextInt();
        System.out.println("Enter credit limit: ");
        int creditLimit = input.nextInt();

        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator(accountNumber, balance, charged, totalOfCredit, creditLimit);

        int newBalance = creditLimitCalculator.newBalance();
        System.out.printf("Your new balance is %s%n", newBalance);
        if (newBalance > creditLimit){
            System.out.println("Credit limit exceeded!");
        }
    }
}
