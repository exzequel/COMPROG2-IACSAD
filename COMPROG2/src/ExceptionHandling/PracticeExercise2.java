package ExceptionHandling;

public class PracticeExercise2 {
    class JavaException2 {
        public static void main(String[] args) {
            try {
                int d = 0;
                int n = 20;
                int fraction = n / d;
                int g[] = {
                    1
                };
                g[20] = 100;
            } 
            catch (Exception e) {
                System.out.println("In the catch block due to Exception = " + e);
            } 
            catch (ArithmeticException e) {
                System.out.println("In the catch block due to Exception = " + e);
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("In the catch block due to Exception = " + e);
            }
            System.out.println("End of Main");
        }
    }
}
