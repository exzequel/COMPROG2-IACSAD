package GRADED_EXERCISE;

import javax.swing.JOptionPane;

public class PrimeComposite {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        if (num <= 1) {
            System.out.println(num + " is not a prime or composite number");
        }
        else if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } 
        else {
            System.out.println(num + " is a composite number");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
