public class Student extends PersonWhoCanSignIn{
    int grade;

    void greeting() {
        super.greeting();
        System.out.println("Yo! It's " + name + "! Wasssssup?");
    }

    void status() {
        System.out.println("Student: " + name + " Grade: " + grade + "th Present: " + present);
    }
}
