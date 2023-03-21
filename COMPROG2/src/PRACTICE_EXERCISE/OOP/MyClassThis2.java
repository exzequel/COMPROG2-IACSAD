package PRACTICE_EXERCISE.OOP;
// PROGRAM 9: MyClassThis2.java

public class MyClassThis2 {
    int x;
    int y;
    public MyClassThis2 (int y) {
        this.x = y;
    }
    public static void main(String[] args) {
        MyClassThis2 myObj = new MyClassThis2(5);
        System.out.println("Value of y = " + myObj.y);
        System.out.println("Value of x = " + myObj.x);
    }
}
