package GRADED_EXERCISE;

import javax.swing.JOptionPane;

public class TestPrime {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        if (num % num == 0 && num % 1 == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is a comoposite number");
        }
    }
}
