package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest(){
        //given
        Account deborahAccount = new Account();

        //when i deposit 5000
        deborahAccount.deposit(5000);

        //check that balance is 5000
        int deborahAccountBalance = deborahAccount.getBalance();

        assertEquals(5000, deborahAccountBalance);
    }

@Test
public void depositTwiceTest(){
        //given there is an account
    Account deborahAccount = new Account ();
    assertEquals(0, deborahAccount.getBalance());
        //given that initial balance is 4000
    deborahAccount.deposit (4000);
    assertEquals(4000, deborahAccount.getBalance());
    //when i deposit 2000
    deborahAccount.deposit (2000);
    //check that balance is 6000
    int deborahAccountBalance = deborahAccount.getBalance();
    assertEquals(6000, deborahAccountBalance);
}

    @Test
    public void depositNegativeAmountTest(){
        //given there is an account
        Account deborahAccount = new Account ();
        //given that initial balance is 4000
        deborahAccount.deposit (4000);
        assertEquals(4000, deborahAccount.getBalance());
        //when i deposit -2000
        deborahAccount.deposit (-2000);

        //check that balance is 4000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(4000, deborahAccountBalance);
    }
    @Test
    public void withdrawMoney(){
        //given
        Account deborahAccount = new Account();
        //when I deposit 4000
        deborahAccount.deposit(5000);
        //when I withdraw urgent 2000
        deborahAccount.withdraw(2000);
        //check that balance is 3000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(3000, deborahAccountBalance);
    }
    @Test
    public void testThatWithdrawalAmountCannotBeGreaterThanBalance(){
        //given
        Account deborahAccount = new Account();
        //when I deposit 5000
        deborahAccount.deposit(5000);
        //when I withdraw 6000
        deborahAccount.withdraw(6000);
        //check that balance is 5000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(5000, deborahAccountBalance);
    }
}