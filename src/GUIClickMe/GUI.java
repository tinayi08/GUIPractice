package GUIClickMe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {

        frame = new JFrame();

        JButton button = new JButton("Click me");
        button.addActionListener(this); //This is so the GUIClickMe.GUI knows when the button is clicked
        label = new JLabel("Number of clicks: 0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10 ,30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);


        frame.add(panel, BorderLayout.CENTER); //set the panel to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set what happens when they close the frame
        frame.setTitle("Our GUIClickMe.GUI"); //set title
        frame.pack(); //set the window to match a  certain size
        frame.setVisible(true); //set the window to be visible and in focus

    }


    public static void main(String[] args) {
        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
