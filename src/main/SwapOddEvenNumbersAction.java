package main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwapOddEvenNumbersAction implements ActionListener {
	
	   private JFrame frame;

	    public SwapOddEvenNumbersAction(JFrame frame) {
	        this.frame = frame;
	    }

    public void actionPerformed(ActionEvent e) {
        // Action for button 3: Swap Odd and Even Numbers
    	
        String input = JOptionPane.showInputDialog(frame, " 3: Enter numbers separated by spaces:");
        if (input != null && !input.isEmpty()) {
            String[] numbers = input.split(" ");
            StringBuilder swappedNumbers = new StringBuilder("Swapped numbers: ");
            for (String number : numbers) {
                int num = Integer.parseInt(number);
                if (num % 2 == 0) {
                    num--; // Make even numbers odd by subtracting 1
                } else {
                    num++; // Make odd numbers even by adding 1
                }
                swappedNumbers.append(num).append(" ");
            }
            JOptionPane.showMessageDialog(frame, swappedNumbers.toString());
        }
    }
}
