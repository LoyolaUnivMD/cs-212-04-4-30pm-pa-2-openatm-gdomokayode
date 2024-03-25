public class Account {
    private String accountOwner;
    private double balance;
    private double[] transactionHistory;
    
    public Account(String accoutOwner) {
        this.accountOwner = accountOwner;
        this.balance = 0;
        transactionHistory = new double[5];
    }
    public void deposit(double depositAmount) {
        balance += depositAmount;
        updateTransactionHistory(depositAmount);
    }
    
    public void withdraw(double withdrawalAmount) {
        balance -= withdrawalAmount;
        updateTransactionHistory(withdrawalAmount * -1);
    }
    
    private void updateTransactionHistory(double x) {
        for(int i = 4; i > 0; i--) {
            transactionHistory[i] = transctionHistory[i - 1];
        }
        transactionHistory[0] = x;
    }
    
    public boolean isOwner(String userName) {
        if(userName == accountOwner) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void getStats () {
        double minTransaction = transactionHistory[0];
        double maxTransaction = transactionHistory[0];
        System.out.println("Account name: " + accountOwner);
        System.out.println("Balance: " + balance);
        System.out.println("Transaction History: " + transactionHistory);
        for (int j = 0; j < transactionHistory.length; j++) {
            if (transactionHistory[j] > maxTransaction) {
                maxtransaction = transactionHistory[j];
            }
            if(transactionHistory[j] < minTransaction) {
                minTransaction = transactionHistory[j];
            }
        }
        System.out.println("Min transaction: " + minTransaction);
        System.out.println("Max transaction: " + maxTransaction);
    }
    
}
