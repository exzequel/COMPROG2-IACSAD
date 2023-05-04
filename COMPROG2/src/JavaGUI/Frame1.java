package JavaGUI;
import javax.swing.*;

// Program 5
public class Frame1 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("New button");
        btnNewButton.setBounds(58, 73, 117, 29);
        frame.getContentPane().add(btnNewButton);

        JLabel lblNewLabel = new JLabel("Hello Java Programmers!");
        lblNewLabel.setBounds(158, 17, 200, 50);
        frame.getContentPane().add(lblNewLabel);

        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
