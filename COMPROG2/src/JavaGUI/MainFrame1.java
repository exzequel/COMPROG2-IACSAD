package JavaGUI;

import java.awt.*;
import javax.swing.*;

// Program 4
public class MainFrame1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Test Frame");
        JLabel sample = new JLabel("This is a sample label");
        frame.getContentPane().setLayout(null);
        frame.setSize(400, 300);
        frame.getContentPane().add(sample);
        sample.setBounds(20, 10, 200, 20); // set location and size of label
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
