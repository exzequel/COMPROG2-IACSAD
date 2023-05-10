package WEEK13_14;

import javax.swing.JTextField;

public class TextEx2 {
    JLabel lbl;
    JTextField text;
    
    public TextEx2() {
        lbl = new JLabel("Enter your name: ");
        text = new JTextField(15);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(lbl);
        getContentPane().add(text);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TextEx2 text = new TextEx2();

        tex.setTitle("JTextField Demo");
        tex.setSize(300, 100);
        tex.setVisible(true);
        
    }
}
