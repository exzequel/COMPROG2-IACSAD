package WEEK13_14;

import java.awt.*;
import javax.swing.*;

public class JComboDemo extends JFrame {
    JLabel lbl;
    JComboBox fruitChoice;

    public JComboDemo() {
        lbl = new JLabel("Select a fruit: ");
        fruitChoice = new JComboBox();
        fruitChoice.addItem("Apple");
        fruitChoice.addItem("Banana");
        fruitChoice.addItem("Cherry");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(lbl);
        getContentPane().add(fruitChoice);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JComboDemo tex = new JComboDemo();
        tex.setTitle("JComboBox Demo");
        tex.setSize(200, 150);
        tex.setVisible(true);
    }

}
