/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgtry;
import javax.swing.*;
/**
 *
 * @author fddyt
 */
public class Banking_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AuthenticationManager authManager = AuthenticationManager.getInstance();

            if (authManager.login("admin", "password")) {
                BankingAppGUI gui = BankingAppGUI.getInstance();
                gui.show();
            } else {
                JOptionPane.showMessageDialog(null, "Authentication failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    }
    

