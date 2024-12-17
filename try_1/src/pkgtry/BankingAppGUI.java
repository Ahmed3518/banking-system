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
public class BankingAppGUI {
    private static BankingAppGUI instance;
    private JFrame frame;

    private BankingAppGUI() {
        frame = new JFrame("Banking System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(new BorderLayout());
        setupUI();
    }

    public static BankingAppGUI getInstance() {
        if (instance == null) {
            instance = new BankingAppGUI();
        }
        return instance;
    }

    private void setupUI() {
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        JButton btnCreateAccount = new JButton("Create Account");
        JButton btnCreateLoan = new JButton("Apply for Loan");
        JButton btnTransaction = new JButton("Perform Transaction");
        JButton btnViewLogs = new JButton("View Logs");

        controlPanel.add(btnCreateAccount);
        controlPanel.add(btnCreateLoan);
        controlPanel.add(btnTransaction);
        controlPanel.add(btnViewLogs);

        frame.add(controlPanel, BorderLayout.NORTH);

        // أزرار الوظائف
        btnCreateAccount.addActionListener(e -> new CreateAccountDialog(frame));
        btnCreateLoan.addActionListener(e -> new CreateLoanDialog(frame));
        btnTransaction.addActionListener(e -> new TransactionDialog(frame));
        btnViewLogs.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Logs functionality coming soon!", "Logs", JOptionPane.INFORMATION_MESSAGE));
    }

    public void show() {
        frame.setVisible(true);
    }
    
}
