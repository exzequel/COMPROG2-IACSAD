package JavaGUI;
import javax.swing.*;
import java.awt.*;

// Program 7
public class DemoJLabel {
    public static void main(String args[]){

        JFrame frame = new JFrame("This is a demo");
        JPanel p = new JPanel();
        JLabel label = new JLabel();
        frame.getContentPane().add(p);
        label.setText("Hello World");
        label.setFont(new Font("Console", Font.PLAIN, 24));
        p.add(label);

        String[] subjects = {"COMPROG1", "COMPROG2",
        "WEBTOOL", "WEBAPPS"};
        JComboBox cboSubject = new JComboBox(subjects);
        p.add(cboSubject);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        male.setSelected(true);
        p.add(male);
        p.add(female);

        frame.setSize(new Dimension(800,600));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        }
}
