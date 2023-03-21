package PRACTICE_EXERCISE.OOP;
// PROGRAM 8: MyClassThis.java

public class MyClassThis {
    int x;
    public MyClassThis (int x) {
        this.x = x;
    }
    public static void main(String[] args) {
        MyClassThis myObj = new MyClassThis(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
