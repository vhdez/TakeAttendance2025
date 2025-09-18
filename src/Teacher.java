public class Teacher extends PersonWhoCanSignIn {
    void status() {
        System.out.println("Teacher: " + name + " is Present: " + present);
    }

    void greeting() {
        System.out.println("Hello Class! " + " In case you forgot name, it's " + name + "Let's get started.");
    }

    public String toString() {
        String niceString = "Teacher ";
        niceString += name;
        return niceString;
    }

    void usePhoneDuringClass() {

    }
}
