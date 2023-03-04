package ASSIGNMENT1;

public class ActB {
    public static void main(String[] args) {
        String[][] tv = {
            {"Program 1: \t", "Program 2: "},
                {"\t1. gma", "\t1. abs"},
                {"\t2. qtv", "\t2. cbn"},
                { "\t3. gma", "\t3. abs" },
                { "\t4. qtv", "\t4. cbn" },
                { "\t5. gma", "\t5. abs" },
                { "\t6. qtv", "\t6. cbn" },
                { "\t7. gma", "\t7. abs" },
                { "\t8. qtv", "\t8. cbn" },
                { "\t9. gma", "\t9. abs" },
                { "\t10. qtv", "\t10. cbn" }

        };

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(tv[i][j] + " ");
            }
            System.out.println();
        }
    }
}
