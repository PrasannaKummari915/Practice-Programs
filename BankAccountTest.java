package JavaDevelopment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setup() {
        account = new BankAccount("Kummari");
    }

    @Test
    public void testInitialBalance() {
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    public void testDeposit() {
        account.deposit(1000);
        assertEquals(1000, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        account.deposit(500);
        account.withdraw(200);
        assertEquals(300, account.getBalance(), 0.001);
    }

    @Test
    public void testOverdraftThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(100);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    public void testNegativeDepositThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50);
        });
        assertEquals("Deposit must be positive", exception.getMessage());
    }

    @Test
    public void testTransactionHistory() {
        account.deposit(100);
        account.withdraw(40);
        List<String> history = account.getTransactionHistory();
        assertEquals(2, history.size());
        assertTrue(history.contains("Deposited: 100.0"));
        assertTrue(history.contains("Withdrew: 40.0"));
    }
}