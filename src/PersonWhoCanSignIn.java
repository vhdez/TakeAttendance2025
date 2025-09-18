public class PersonWhoCanSignIn {
    String name;
    boolean present;
    int password;
    void greeting() {
        System.out.println(name + " is here!");
    }
    void status() {

    }

    public String toString() {
        String niceString = name;
        if (present) {
            niceString += " is present";
        } else {
            niceString += " is NOT present; use password: " + password;
        }
        return niceString;
    }

}
