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
public class CreateAccountDialog extends JDialog {
    public CreateAccountDialog(JFrame parent) {
        super(parent, "Create Account", true);

        setLayout(new GridLayout(3, 2));

        add(new JLabel("Account Type:"));
        String[] accountTypes = {"Savings", "Checking", "Loan"};
        JComboBox<String> accountTypeDropdown = new JComboBox<>(accountTypes);
        add(accountTypeDropdown);

        JButton btnCreate = new JButton("Create");
        add(btnCreate);

        btnCreate.addActionListener(e -> {
            String selectedType = (String) accountTypeDropdown.getSelectedItem();
            Command createAccountCommand = new CreateAccountCommand(selectedType);
            CommandInvoker invoker = new CommandInvoker();
            invoker.executeCommand(createAccountCommand);

            JOptionPane.showMessageDialog(this, "Created: " + selectedType + " Account", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        });

        setSize(300, 200);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
}
