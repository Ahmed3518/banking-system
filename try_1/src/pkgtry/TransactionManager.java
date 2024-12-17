/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgtry;

/**
 *
 * @author fddyt
 */
public class TransactionManager {
     private static TransactionManager instance;

    private TransactionManager() { }

    public static TransactionManager getInstance() {
        if (instance == null) {
            instance = new TransactionManager();
        }
        return instance;
    }

    public void performTransaction(String accountId, double amount, String type) {
        System.out.println("Transaction performed: " + type + " of $" + amount + " for Account ID: " + accountId);
    }
}
