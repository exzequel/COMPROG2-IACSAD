package ASSIGNMENT1;

public class ActivityB {
    public static void main(String[] args) {
        // Program 1
        String[] gmaQtvArray = { "gma", "qtv" };
        System.out.println("Program 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + gmaQtvArray[(i - 1) % 2] + " ");
        }
        System.out.println();

        // Program 2
        System.out.println("Program 2:");
        String[] absCbnArray = { "cbn", "abs" };
        for (int i = 2; i <= 10; i++) {
            System.out.println(i + ". " + absCbnArray[(i - 2) % 2] + " ");
        }
        System.out.println();

    }
}
