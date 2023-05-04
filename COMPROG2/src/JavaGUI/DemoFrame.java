package JavaGUI;
import java.awt.*;
import javax.swing.*;

// Program 1
public class DemoFrame {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("This is a demo");
        frame.setSize(new Dimension(500, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}

