package JavaGUI;

import java.awt.*;
import javax.swing.*;

// Program 4
public class MainFrame1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        JLabel sample = new JLabel("This is a sample label");
        frame.getContentPane().setLayout(null);
        frame.setSize(new Dimension(400, 300));
        frame.getContentPane().add(sample);
        frame.setBounds(50, 100, 200, 20);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
