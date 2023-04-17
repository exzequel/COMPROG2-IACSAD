package LAB_ACT5;
// ADIZON, EXEQUEL B. I-ACSAD
public class Household {

    private int occupants;
    private double income;

    public Household() {
        this.occupants = 1;
        this.income = 0.0;
    }

    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getOccupants() {
        return this.occupants;
    }

    public double getIncome() {
        return this.income;
    }

    public static void main(String[] args) {
        Household myHousehold = new Household();
        myHousehold.setOccupants(4);
        myHousehold.setIncome(20000.0);
        System.out.println("Occupants: " + myHousehold.getOccupants());
        System.out.println("Annual Income: " + myHousehold.getIncome());

    }
}
