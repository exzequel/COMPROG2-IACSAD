package JavaGUI;
import javax.swing.*;

// Program 6
public class ButtonExample2 {
    ButtonExample2() {
        JFrame f=new JFrame("Button Example");
        f.getContentPane().setLayout(null);
        JButton b=new JButton(new
        ImageIcon("C:/Users/Jomariss/Pictures/logo lion.jpg"));
        b.setBounds(100,100,200, 100);
        f.getContentPane().add(b);
        f.setSize(500,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ButtonExample2();
    } 
}
