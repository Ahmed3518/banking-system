/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgtry;

/**
 *
 * @author fddyt
 */
public class AuthenticationManager {
    private static AuthenticationManager instance;
    private String currentUser;

    private AuthenticationManager() { }

    public static AuthenticationManager getInstance() {
        if (instance == null) {
            instance = new AuthenticationManager();
        }
        return instance;
    }

    public boolean login(String username, String password) {
        if (username.equals("admin") && password.equals("password")) {
            currentUser = username;
            return true;
        }
        return false;
    }

    public void logout() {
        currentUser = null;
    }

    public String getCurrentUser() {
        return currentUser;
    }
    
}
