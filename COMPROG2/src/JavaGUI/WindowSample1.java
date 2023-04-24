package JavaGUI;
import javax.swing.*;
import java.awt.*;

// Program 2
public class WindowSample1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(350, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Window");
        f.getContentPane().setBackground(Color.RED);
    }
}
