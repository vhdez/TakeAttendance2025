import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Good morning!");
        System.out.println("Let's take attendance...");
        System.out.println("Aman is present YAYAAYAY");


        System.out.println("Harry Grade 11 is present!");
        System.out.println("Minghao Grade  12 is maybe present!");
        System.out.println("Alex is present");
        System.out.println("Sam is present");
        System.out.println("Tai is present");
        System.out.println("Adil is present.");

        Teacher mrH = new Teacher();
        mrH.name = "Mr. Hernandez";
        mrH.present = false;
        mrH.password = 9884;
        mrH.greeting();

        Student alex = new Student();
        alex.name = "Alexander Chancey";
        alex.grade=10;
        alex.password = 7373;
        alex.present = false;

        // 1. Create an Object for yourself
        // 2. Store YOUR values in YOUR object
        // 3. Tell YOUR object to announce themselves

        Scanner myTextScanner = new Scanner(System.in);  // Create a Scanner object
        boolean notDoneYet = true;
        while (notDoneYet) {
            System.out.print("Type your name:");
            String typedName = myTextScanner.nextLine();  // Read user input
            System.out.print("Type your password:");
            String typedPassword = myTextScanner.nextLine();  // Read user input

            // typedPassword = "9884"
            // BUT
            // mrH.password = 9884 (the integer)
            int typedPasswordNumber = Integer.valueOf(typedPassword);
            if (mrH.name.equals(typedName)) {
                if (mrH.password == typedPasswordNumber) {
                    mrH.present = true;
                }
            }

            if (alex.name.equals(typedName)) {
                if (alex.password == typedPasswordNumber) {
                    alex.present = true;
                    alex.greeting();
                }
            }
            mrH.status();

            // 4. Get typing input to check for your name/password/presence

        }
    }
}