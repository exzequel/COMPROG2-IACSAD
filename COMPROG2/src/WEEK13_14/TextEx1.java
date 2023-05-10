package WEEK13_14;

import java.awt.*;
import javax.swing.*;

public class TextEx1 extends JFrame {
    JLabel lbl;

    public TextEx1() {
        lbl = new JLabel("Enter your name: ", JLabel.CENTER);
        getContentPane().add(lbl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TextEx1 tex = new TextEx1();

        tex.setTitle("JLabel Demo");
        tex.setSize(250, 100);
        tex.setVisible(true);
    }

}
