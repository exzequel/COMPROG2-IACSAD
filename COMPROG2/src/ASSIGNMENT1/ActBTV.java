package ASSIGNMENT1;
// COMPROG2 ASSIGNMENT 1 - ACTIVITY B

public class ActBTV {
    public static void main(String[] args) {
        String PROGRAM_1 = "Program 1: \t";
        String PROGRAM_2 = "Program 2: \t";
        String GMA = "gma";
        String QTV = "qtv";
        String ABS = "abs";
        String CBN = "cbn";

        String[][] tv = {
                { PROGRAM_1, PROGRAM_2 },
                { "\t1. " + GMA + "\t", "\t2. " + CBN },
                { "\t2. " + QTV + "\t", "\t3. " + ABS },
                { "\t3. " + GMA + "\t", "\t4. " + CBN },
                { "\t4. " + QTV + "\t", "\t5. " + ABS },
                { "\t5. " + GMA + "\t", "\t6. " + CBN },
                { "\t6. " + QTV + "\t", "\t7. " + ABS },
                { "\t7. " + GMA + "\t", "\t8. " + CBN },
                { "\t8. " + QTV + "\t", "\t9. " + ABS },
                { "\t9. " + GMA + "\t", "\t10. " + CBN },
                { "\t10. " + QTV, " " }
        };

        for (int i = 0; i < tv.length; i++) {
            for (int j = 0; j < tv[i].length; j++) {
                System.out.print(tv[i][j] + " ");
            }
            System.out.println();
        }
    }
}
