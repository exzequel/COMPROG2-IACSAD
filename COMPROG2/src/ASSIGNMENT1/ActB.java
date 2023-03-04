package ASSIGNMENT1;

public class ActB {
    public static void main(String[] args) {
        String PROGRAM_1 = "Program 1: \t";
        String PROGRAM_2 = "Program 2: \t";
        String GMA = "gma";
        String QTV = "qtv";
        String ABS = "abs";
        String CBN = "cbn";

        String[][] tv = {
                { PROGRAM_1, PROGRAM_2 },
                { "\t1. " + GMA + "\t", "\t1. " + ABS },
                { "\t2. " + QTV + "\t", "\t2. " + CBN },
                { "\t3. " + GMA + "\t", "\t3. " + ABS },
                { "\t4. " + QTV + "\t", "\t4. " + CBN },
                { "\t5. " + GMA + "\t", "\t5. " + ABS },
                { "\t6. " + QTV + "\t", "\t6. " + CBN },
                { "\t7. " + GMA + "\t", "\t7. " + ABS },
                { "\t8. " + QTV + "\t", "\t8. " + CBN },
                { "\t9. " + GMA + "\t", "\t9. " + ABS },
                { "\t10. " + QTV, "\t10. " + CBN }
        };

        for (int i = 0; i < tv.length; i++) {
            for (int j = 0; j < tv[i].length; j++) {
                System.out.print(tv[i][j] + " ");
            }
            System.out.println();
        }
    }
}
