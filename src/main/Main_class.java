package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;

    public Main_class() {
        frame = new JFrame("Login Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");

        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                // Validate the username and password
                boolean loggedIn = login(username, password);

                if (loggedIn) {
                    JOptionPane.showMessageDialog(frame, "Login successful. Welcome, " + username + "!");
                    // Close the login frame
                    frame.dispose();
                    showMenu();
                } else {
                    JOptionPane.showMessageDialog(frame, "Login failed. Invalid username or password.");
                }
            }
        });

        frame.setVisible(true);
    }

    private void showMenu() {
        // Create a menu with options numbered from 1 to 10
        JFrame menuFrame = new JFrame("Menu");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when this frame is closed
        menuFrame.setSize(400, 300);
        menuFrame.setLayout(new GridLayout(10, 1)); // 10 rows, 1 column for options

        button1 = new JButton("1. Search Odd Numbers");
        button2 = new JButton("2. Search Even Numbers");
        button3 = new JButton("3. Swap Odd and Even Numbers");
        button4 = new JButton("4. Search for the Largest Number");
        button5 = new JButton("5. Search for the Smallest Number");
        button6 = new JButton("6. Swap the Largest and Smallest Numbers");
        button7 = new JButton("7. Delete nth Element");
        button8 = new JButton("8. Insertion of Elements");
        button9 = new JButton("9. Delete Elements Divisible by 3");
        button10 = new JButton("10. Delete Elements Divisible by User Input");

        // Create instances of action classes and attach them to buttons
        button1.addActionListener(new SearchOddNumbersAction(menuFrame));
        button2.addActionListener(new SearchEvenNumbersAction(menuFrame));
        button3.addActionListener(new SwapOddEvenNumbersAction(menuFrame));

        // Add buttons to the menu frame
        menuFrame.add(button1);
        menuFrame.add(button2);
        menuFrame.add(button3);
        menuFrame.add(button4);
        menuFrame.add(button5);
        menuFrame.add(button6);
        menuFrame.add(button7);
        menuFrame.add(button8);
        menuFrame.add(button9);
        menuFrame.add(button10);

        // Make the menu frame visible
        menuFrame.setVisible(true);
    }

    private boolean login(String username, String password) {
        // Define valid username-password pairs
        String[] validUsernames = {"cope", "barcelona", "belaos", "dacillo", "broqueza"};
        String[] validPasswords = {"admin1", "admin2", "admin3", "admin4", "admin5"};

        // Check if the entered username and password match any of the valid pairs
        for (int i = 0; i < validUsernames.length; i++) {
            if (username.equals(validUsernames[i]) && password.equals(validPasswords[i])) {
                return true; // Match found, login successful
            }
        }

        return false; // No match found, login failed
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main_class();
            }
        });
    }
}