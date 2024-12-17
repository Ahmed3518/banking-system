/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgtry;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author fddyt
 */
public class CreateLoanDialog extends JDialog {
    public CreateLoanDialog(JFrame parent) {
        super(parent, "Apply for Loan", true);

        setLayout(new GridLayout(3, 2));

        add(new JLabel("Loan Type:"));
        String[] loanTypes = {"Home", "Personal", "Car"};
        JComboBox<String> loanTypeDropdown = new JComboBox<>(loanTypes);
        add(loanTypeDropdown);

        JButton btnApply = new JButton("Apply");
        add(btnApply);

        btnApply.addActionListener(e -> {
            String selectedType = (String) loanTypeDropdown.getSelectedItem();
            Command createLoanCommand = new CreateLoanCommand(selectedType);
            CommandInvoker invoker = new CommandInvoker();
            invoker.executeCommand(createLoanCommand);

            JOptionPane.showMessageDialog(this, "Applied for: " + selectedType + " Loan", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        });

        setSize(300, 200);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
}
