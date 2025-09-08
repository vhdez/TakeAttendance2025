public class Teacher {
    String name;
    boolean present;

    void greeting() {
        System.out.println("Hello! " + name + " is here!");
    }

    void status() {
        System.out.println("Student: " + name + "th\nPresent: " + present);
    }

}
