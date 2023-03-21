package PRACTICE_EXERCISE.OOP;

public class Pay {
    public static void main(String[] args) {
        double hoursWorked;
        double rateOfPay;
        double witholdingRate;
        double grossPay;
        double netPay;

        System.out.println(computeNetPay(1,2,3));
    }

    public static void computeNetPay(double hoursWorked, double rateOfPay, double witholdingRate) {
        double grossPay = hoursWorked * rateOfPay;
        double netPay = grossPay * (1 - withholdingRate);
        System.out.println("Three arguments ");
    }
    
    public static void computeNetPay(double hoursWorked, double rateOfPay) {
        double witholdingRate = 10.00;
        System.out.println("Two arguments");
    }
    
    public static void computeNetPay(double hoursWorked) {
        System.out.println("One argument ");
    }
}
