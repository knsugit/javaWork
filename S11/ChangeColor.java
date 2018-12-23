import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;

public class ChangeColor extends JFrame {
    public JButton redBt = new JButton("set red");
    public JButton greenBt = new JButton("set green");
    public JButton blueBt = new JButton("set blue");

    public ChangeColor() {
        super("Change Color Program");

        Container container = getContentPane();
        container.setLayout(new GridLayout(1,3));
        container.add(redBt);
        container.add(greenBt);
        container.add(blueBt);

        redBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                redBt.setForeground(Color.RED);
                greenBt.setForeground(Color.RED);
                blueBt.setForeground(Color.RED);
            }
        });

        greenBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                redBt.setForeground(Color.GREEN);
                greenBt.setForeground(Color.GREEN);
                blueBt.setForeground(Color.GREEN);
            }
        });

        blueBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                redBt.setForeground(Color.BLUE);
                greenBt.setForeground(Color.BLUE);
                blueBt.setForeground(Color.BLUE);
            }
        });

        setSize(330, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ChangeColor();
    }
}