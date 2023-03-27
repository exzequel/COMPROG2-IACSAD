package INHERITANCE_PRACTICE;

// Program 1
// class A {
//     int x;
//     int y;
//     int get(int p, int q) {
//         x = p; y = q; return(0);
//     }
//     void Show(){
//         System.out.println(x);
//     }
// }

// class B extends A {
//     public static void main(String[] args) {
//         A a = new A();
//         a.get(5, 6);
//         a.Show();
//     }
//     void display() {
//         System.out.println("B");
//     }
// }

// Program 2

class A {
    int x;
    int y;

    int get(int p, int q) {
        x = p;
        y = q;
        return (0);
    }

    void Show() {
        System.out.println(x);
    }
}

class B extends A {
    void Showb() {
        System.out.println("B");
    }
}

class C extends B {
    void display() {
        System.out.println("C");   
    }
    
    public static void main(String[] args) {
        B b = new B();
        b.get(5, 6);
        b.Showb();
    }
}



