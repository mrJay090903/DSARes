package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchEvenNumbersAction implements ActionListener {
    private JFrame frame;

    public SearchEvenNumbersAction(JFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        // Action for button 2: Search Even Numbers
        String input = JOptionPane.showInputDialog(frame, "2: Enter numbers separated by spaces:");
        if (input != null && !input.isEmpty()) {
            String[] numbers = input.split(" ");
            StringBuilder evenNumbers = new StringBuilder("Even numbers: ");
            for (String number : numbers) {
                int num = Integer.parseInt(number);
                if (num % 2 == 0) {
                    evenNumbers.append(num).append(" ");
                }
            }
            JOptionPane.showMessageDialog(frame, evenNumbers.toString());
        }
    }
}
