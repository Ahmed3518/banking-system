/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgtry;

/**
 *
 * @author fddyt
 */
public class LoanFactory {
    public static Loan createLoan(String type) {
        switch (type.toLowerCase()) {
            case "home":
                return new HomeLoan();
            case "personal":
                return new PersonalLoan();
            case "car":
                return new CarLoan();
            default:
                throw new IllegalArgumentException("Invalid loan type: " + type);
        }
    }
}
