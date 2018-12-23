import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;

public class Computer extends JFrame {
    JTextField textField = new JTextField();
    JButton button0 = new JButton();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    public Computer() {
        super("Computer");

        Container container = getContentPane();
        container.add(textField, BorderLayout.NORTH);
        
        container.add(button7, BorderLayout.CENTER);
        container.add(button8, BorderLayout.CENTER);
        container.add(button9, BorderLayout.CENTER);

        setSize(330, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Computer();
    }
}