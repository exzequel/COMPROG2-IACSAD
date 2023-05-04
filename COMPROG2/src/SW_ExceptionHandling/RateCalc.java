package SW_ExceptionHandling;
import java.lang.*;
import java.io.*;

// PART 1
public class RateCalc {
    public static int calcInsurance(String birth) throws Exception {
        final int year = 2023; // Change year '2000' to current year '2023'
        int age = 0;
        int birthYear = Integer.parseInt(birth);
        age = year - birthYear;

        if (age < 16) {
            throw new Exception("Age is: " + age);
        } else {
            int drivenYears = age - 16;
            if (drivenYears < 4) {
                return 1000;
            } else {
                return 600;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String inData = null;
        System.out.println("Enter birth year: ");
        inData = stdin.readLine();
        try {
            System.out.println("Your insurance is: " + calcInsurance(inData));
        } catch (Exception oops) {
            System.out.println("Too young for insurance!");
        }

    }
}


