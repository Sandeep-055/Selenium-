package Java1;
import javax.swing.*;
import java.awt.*;

public class Calculator {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Calculator");
    frame.setSize(400, 400);

    // Create buttons and input field
    JTextField inputField = new JTextField();
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton addButton = new JButton("+");
    JButton equalsButton = new JButton("=");

    // Add buttons and input field to the frame
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2, 2));
    panel.add(button1);
    panel.add(button2);
    panel.add(addButton);
    panel.add(equalsButton);

    frame.getContentPane().add(BorderLayout.NORTH, inputField);
    frame.getContentPane().add(BorderLayout.CENTER, panel);

    // Add functionality to the buttons
    addButton.addActionListener(e -> {
      int num1 = Integer.parseInt(inputField.getText());
      inputField.setText("");
      addButton.addActionListener(e2 -> {
        int num2 = Integer.parseInt(inputField.getText());
        int sum = num1 + num2;
        inputField.setText(String.valueOf(sum));
      });
    });

    equalsButton.addActionListener(e -> {
      int num1 = Integer.parseInt(inputField.getText());
      int num2 = Integer.parseInt(inputField.getText());
      int sum = num1 + num2;
      inputField.setText(String.valueOf(sum));
    });

    frame.setVisible(true);
  }
}