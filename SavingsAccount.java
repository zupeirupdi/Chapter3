import java.util.Stack;

public class SavingsAccount {
    private double balance;
    private Stack<Double> history = new Stack<>();
    public SavingsAccount(double balance) { this.balance = balance; }
    public void deposit(double amount) {
        balance = balance + amount;
        history.push(amount);              // remember it
        System.out.println("Deposit " + amount + " -> balance " + balance);
    }
    public void undoLastDeposit() {
        if (history.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }
        double last = history.pop();       // most recent deposit
        balance = balance - last;
        System.out.println("Undo " + last + " -> balance " + balance);
    }
}
