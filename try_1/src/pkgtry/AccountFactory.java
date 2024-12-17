/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgtry;

/**
 *
 * @author fddyt
 */
public class AccountFactory {
    public static Account createAccount(String type) {
        switch (type.toLowerCase()) {
            case "savings":
                return new SavingsAccount();
            case "checking":
                return new CheckingAccount();
            case "loan":
                return new LoanAccount();
            default:
                throw new IllegalArgumentException("Invalid account type: " + type);
        }
    }
    
}
