/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgtry;

/**
 *
 * @author fddyt
 */
public class CreateAccountCommand implements Command {
    private String accountType;

    public CreateAccountCommand(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public void execute() {
        Account account = AccountFactory.createAccount(accountType);
        System.out.println("Account Created: " + account.getAccountType());
    }
}
