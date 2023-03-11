package GRADED_EXERCISE;

import javax.swing.JOptionPane;

public class TestMultiple {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first argument: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second argument: "));

        if (num1 % num2 == 0) {
            System.out.println(num2 + " is a multiple of " + num1);
        } else {
            System.out.println(num2 + " is not a multiple of " + num1);
        }
    }
}
