package LAB_EXERCISE4;

public class Pay {
    private double hoursWorked;
    private double rateOfPay;
    private double withholdingRate;
    private double grossPay;
    private double netPay;

    public Pay(double hoursWorked, double rateOfPay, double withholdingRate) {
        this.hoursWorked = hoursWorked;
        this.rateOfPay = rateOfPay;
        this.withholdingRate = withholdingRate;
    }

    public Pay(double hoursWorked, double rateOfPay) {
        this(hoursWorked, rateOfPay, 0.10); // set default withholding rate to 10%
    }

    public Pay(double hoursWorked) {
        this(hoursWorked, 0.0); // set default pay rate to 0 and withholding rate to 5%
    }

    public void computeNetPay() {
        grossPay = hoursWorked * rateOfPay;
        netPay = grossPay * (1.0 - withholdingRate);
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getNetPay() {
        return netPay;
    }

    public static void main(String[] args) {

        Pay pay1 = new Pay(40, 15.50, 0.05); // 40 hours worked, pay rate $15.50, withholding rate 5%
        pay1.computeNetPay();
        System.out.printf("Gross pay: $%.2f | Net pay: $%.2f\n", pay1.getGrossPay(), pay1.getNetPay());

        Pay pay2 = new Pay(13, 12.00); // 20 hours worked, pay rate $12.00, withholding rate 10% (default)
        pay2.computeNetPay();
        System.out.printf("Gross pay: $%.2f | Net pay: $%.2f\n", pay2.getGrossPay(), pay2.getNetPay());

        Pay pay3 = new Pay(10); // 10 hours worked, pay rate 0 (default), withholding rate 5% (default)
        pay3.computeNetPay();
        System.out.printf("Gross pay: $%.2f | Net pay: $%.2f\n", pay3.getGrossPay(), pay3.getNetPay());
    }

}
