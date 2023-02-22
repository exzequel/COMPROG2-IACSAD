import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview {
    public static void main(String[] args) throws Exception {
        
        // String dog[] = new String[5];
        // dog[0] = "Rocky";
        // dog[1] = "Whitey";
        // dog[2] = "Blackie";
        // dog[3] = "Brownie";
        // dog[4] = "Pappie";

        // System.out.println(dog[1]);

        // int Numbers[] = {1, 2, 3, 4, 5};

        // System.out.println(Numbers);

        // int Numbers[] = new int[5];
        // Numbers[0] = 10;
        // Numbers[1] = 20;
        // Numbers[2] = 30;
        // Numbers[3] = 40;
        // Numbers[4] = 50;

        // String Name[] = new String[5];
        // Name[0] = "Joms";
        // Name[1] = "Alecs";
        // // Name[2] = "Joms";
        // Name[3] = "CM";
        // // Name[4] = "Joms";

        Scanner scanner = new Scanner(System.in);

        int[] Numbers = new int[5];
        
        for (int i=0; i<5; i++) {
            Numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("You entered: " + Numbers[i]);
        }

        // System.out.println(Arrays.toString(Numbers));

    }
}
