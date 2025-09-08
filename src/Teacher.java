public class Teacher {
    String name;
    boolean present;
    int password;

    void greeting() {
        System.out.println("Hello! " + name + " is here!");
    }

    void status() {
        System.out.println("Teacher: " + name + " is Present: " + present);
    }

}
