package GRADED_EXERCISE;

import javax.swing.JOptionPane;

public class Multiple {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first argument: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second argument: "));

        if (isMultiple(num1, num2)) {
            System.out.println(num2 + " is a multiple of " + num1);
        } else {
            System.out.println(num2 + " is not a multiple of " + num1);
        }
    }

    public static boolean isMultiple(int num1, int num2) {
        if (num1 % num2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
