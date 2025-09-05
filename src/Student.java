public class Student {
    String name;
    int grade;
    boolean present;

    void greeting() {
        System.out.println("Hello! " + name + " is here!");
    }

    void status() {
        System.out.println("Student: " + name + "\nGrade: " + grade + "th\nPresent: " + present);
    }
}
