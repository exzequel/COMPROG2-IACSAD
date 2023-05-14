package WEEK13_14;

import java.awt.*;
import javax.swing.*;

// Program #5 JTextAreaDemo
public class JTextAreaDemo extends JFrame {
    JTextArea resultArea = new JTextArea(5, 20);

    public JTextAreaDemo() {
        resultArea.setText("Enter more text to see scrollbars");
        JScrollPane scrolllingArea = new JScrollPane(resultArea);

        JPanel con = new JPanel();
        con.setLayout(new BorderLayout());
        con.add(scrolllingArea, BorderLayout.CENTER);

        this.setContentPane(con);
        this.setTitle("JTextArea Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

    }
    
    public static void main(String[] args) {
        JFrame aFrame = new JTextAreaDemo();
        aFrame.setVisible(true);
    }
}
