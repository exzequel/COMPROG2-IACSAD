package PRACTICE_EXERCISE.OOP;
// PROGRAM 2: MethodOverloading.java
class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Result: " + aMethod(13, 2.0));
    }
    public static double aMethod(int a, int b) {
        return a * b;
    }
    
    public static double aMethod(int a, double b) {
        return a + b;
    }
    
    public static double aMethod(double a, int b) {
        return a - b;
    }
    
    public static double aMethod(double a, double b) {
        return a / b;
    }
}
