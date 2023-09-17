package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchOddNumbersAction implements ActionListener {
    private JFrame frame;

    public SearchOddNumbersAction(JFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        // Action for button 1: Search Odd Numbers
        String input = JOptionPane.showInputDialog(frame, "1: Enter numbers separated by spaces:");
        if (input != null && !input.isEmpty()) {
            String[] numbers = input.split(" ");
            StringBuilder oddNumbers = new StringBuilder("Odd numbers: ");
            for (String number : numbers) {
                int num = Integer.parseInt(number);
                if (num % 2 != 0) {
                    oddNumbers.append(num).append(" ");
                }
            }
            JOptionPane.showMessageDialog(frame, oddNumbers.toString());
        }
    }
}
