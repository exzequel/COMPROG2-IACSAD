package JavaGUI;
import java.awt.*;
import javax.swing.*;

// Program 3
public class MainFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Test Frame");
        JLabel sample = new JLabel("This is a sample label"); // add label
        frame.setSize(new Dimension(400, 300));
        frame.getContentPane().add(sample); // retrieve content pant layer to add label object
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
