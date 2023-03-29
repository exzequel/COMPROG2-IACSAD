package LAB_ACT5;
// ADIZON, EXEQUEL I-ACSAD
public class Test_Student {
    public static void main(String[] args) {
        // a. Create an object of Student class - "student1"
        // use a constructor that will initialize all the Student details
        Student student1 = new Student("Exequel Adizon", "Computer Science", "Application Development", 19, "Male", 123456789);

        // b. Create an object of Student class - "student2"
        // use the default constructor and set the other Student details using the setter() methods
        Student student2 = new Student();
        student2.setName("Ricky Marie David");
        student2.setProgram("Computer Science");
        student2.setCourse("Software Engineering");
        student2.setAge(20);
        student2.setGender("Female");
        student2.setStudentId(987654321);

        // c. Create an object of Student class - "student3"
        // use the constructor to set the value of program to "Information and Technology" and course to "IT Service Mangement"
        // set other Student details using the setter() methods
        Student student3 = new Student("Clement Michael David", "Information and Technology", "IT Service Management");
        student3.setAge(22);
        student3.setGender("Male");
        student3.setStudentId(246810120);

        // d. Display the details of "student1" using the getters() methods.
        System.out.println("Details of Student 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Program: " + student1.getProgram());
        System.out.println("Course: " + student1.getCourse());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Gender: " + student1.getGender());
        System.out.println("Student ID: " + student1.getStudentId());

        // e. Display the details of "student2" using the displayStudentInformation()
        System.out.println("\nDetails of Student 2:");
        student2.displayStudentInformation();

        // f. Display the details of "student3" using the displayStudentInformation()
        System.out.println("\nDetails of Student 3:");
        student3.displayStudentInformation();
    }
}

class Student {
    private String name;
    private String program;
    private String course;
    private int age;
    private String gender;
    private long studentId;

    // Constructor to initialize all details
    public Student(String name, String program, String course, int age, String gender, long studentId) {
        this.name = name;
        this.program = program;
        this.course = course;
        this.age = age;
        this.gender = gender;
        this.studentId = studentId;
    }

    // Constructor to set program and course
    public Student(String name, String program, String course) {
        this(name, program, course, 0, "", 0);
    }

    // Default constructor
    public Student() {
        this("", "", "", 0, "", 0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void displayStudentInformation() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Student ID: " + studentId);
    }
}
