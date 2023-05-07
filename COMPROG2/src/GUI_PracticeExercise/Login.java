package GUI_PracticeExercise;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        // Creating object of LoginFrame class and setting some of its properties
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
