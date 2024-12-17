/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgtry;

/**
 *
 * @author fddyt
 */
public class CreateLoanCommand implements Command {
    private String loanType;

    public CreateLoanCommand(String loanType) {
        this.loanType = loanType;
    }

    @Override
    public void execute() {
        Loan loan = LoanFactory.createLoan(loanType);
        System.out.println("Loan Applied: " + loan.getLoanType());
    }
}
