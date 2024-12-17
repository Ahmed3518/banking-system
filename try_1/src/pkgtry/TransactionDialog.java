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
public class TransactionDialog extends JDialog {
    public TransactionDialog(JFrame parent) {
        super(parent, "Perform Transaction", true);

        setLayout(new GridLayout(4, 2));

        add(new JLabel("Account ID:"));
        JTextField accountIdField = new JTextField();
        add(accountIdField);

        add(new JLabel("Transaction Type:"));
        String[] transactionTypes = {"Deposit", "Withdraw"};
        JComboBox<String> transactionTypeDropdown = new JComboBox<>(transactionTypes);
        add(transactionTypeDropdown);

        add(new JLabel("Amount:"));
        JTextField amountField = new JTextField();
        add(amountField);

        JButton btnPerform = new JButton("Perform");
        add(btnPerform);

        btnPerform.addActionListener(e -> {
            String accountId = accountIdField.getText();
            String selectedType = (String) transactionTypeDropdown.getSelectedItem();
            double amount;

            try {
                amount = Double.parseDouble(amountField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid amount. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (accountId.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Account ID cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Command performTransactionCommand = new PerformTransactionCommand(accountId, amount, selectedType);
            CommandInvoker invoker = new CommandInvoker();
            invoker.executeCommand(performTransactionCommand);

            JOptionPane.showMessageDialog(this, selectedType + " of $" + amount + " completed for Account ID: " + accountId, "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        });

        setSize(400, 200);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
}
