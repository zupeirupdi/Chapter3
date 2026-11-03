public class DepositUndoTest {
    public static void main(String[] args) {
        SavingsAccount acc =
            new SavingsAccount(100);
        acc.deposit(50);
        acc.deposit(20);
        acc.deposit(30);
        acc.undoLastDeposit();
        acc.undoLastDeposit();
    }
}
