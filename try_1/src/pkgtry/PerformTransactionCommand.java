/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgtry;

/**
 *
 * @author fddyt
 */
public class PerformTransactionCommand implements Command {
    private String accountId;
    private double amount;
    private String transactionType;

    public PerformTransactionCommand(String accountId, double amount, String transactionType) {
        this.accountId = accountId;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    @Override
    public void execute() {
        TransactionManager transactionManager = TransactionManager.getInstance();
        transactionManager.performTransaction(accountId, amount, transactionType);
    }
}
