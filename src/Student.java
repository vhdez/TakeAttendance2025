public class Student {
    String name;
    int grade;
    boolean present;
    int password;

    void greeting() {
        System.out.println("Hello! " + name + " is here!");
    }

    void status() {
        System.out.println("Student: " + name + " Grade: " + grade + "th Present: " + present);
    }
}
