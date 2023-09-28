package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchEvenNumbersAction implements ActionListener {
    private JFrame menuFrame;
    private int[] numbers;

    public SearchEvenNumbersAction(JFrame menuFrame, int[] numbers) {
        this.menuFrame = menuFrame;
        this.numbers = numbers;
    }

    public void actionPerformed(ActionEvent e) {
        String input = JOptionPane.showInputDialog(menuFrame, "Enter '2' to display Even numbers:");
        if ("2".equals(input)) {
            String result = "Even numbers in the array: ";
            for (int number : numbers) {
                if (number % 2 == 0) {
                    result += number + " ";
                }
            }
            JOptionPane.showMessageDialog(menuFrame, result);
        } else {
            JOptionPane.showMessageDialog(menuFrame, "Invalid input. Please enter '1' to display odd numbers.");
        }
    }
}
