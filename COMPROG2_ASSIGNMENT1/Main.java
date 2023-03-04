// COMPROG2_ASSIGNMENT1 ACTIVITY A
package COMPROG2_ASSIGNMENT1;

import java.io.*;

public class Main {

    public static InputStreamReader reader = new InputStreamReader(System.in);
    public static BufferedReader input = new BufferedReader(reader);
    public static void main(String[] args)throws Exception {
        int x;
        double prod = 1;

        do {
            System.out.println("Enter a number: ");
            x = Integer.parseInt(input.readLine());
        
            if (x < 0 || x > 100) {
                System.out.println("Invalid!");
            }
            else {
                for (int n = 1; n <= x; n++) {
                    prod = prod*n;
            }
                System.out.println(+prod);
                prod = 1;            
            } 

    } while (x != 0);
}
}
