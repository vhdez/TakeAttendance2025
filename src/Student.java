public class Student extends PersonWhoCanSignIn{
    int grade;

    void greeting() {
        System.out.println("Hello! " + name + " is here!");
    }

    void status() {
        System.out.println("Student: " + name + " Grade: " + grade + "th Present: " + present);
    }
}
