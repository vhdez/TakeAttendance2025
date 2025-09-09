import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Good morning!");
        System.out.println("Let's take attendance...");
        System.out.println("Sam is present");
        System.out.println("Tai is present");
        System.out.println("Adil is present.");

        Teacher mrH = new Teacher();
        String myName = "Mr. Hernandez";
        mrH.name = myName;
        mrH.present = false;
        mrH.password = 9884;

        Student alex = new Student();
        alex.name = "Alexander Chancey";
        alex.grade=10;
        alex.password = 7373;
        alex.present = false;

        Student aman = new Student();
        aman.name = "Aman Easterling";
        aman.grade=12;
        aman.password = 5259;
        aman.present = false;

        Student Zhang = new Student();
        Zhang.name = "Minghao";
        Zhang.password = 1234;
        Zhang.present = false;
        Zhang.grade = 12;

        Student harry = new Student();
        harry.name = "Harry";
        harry.present = false;
        harry.password = 0000;

        Student tai = new Student();
        tai.name = "Tai";
        tai.present = false;
        tai.grade = 12;
        tai.password = 1212;

        Student Kabir = new Student();
        Kabir.name = "Adil";
        Kabir.present = false;
        Kabir.grade = 12;
        Kabir.password = 4167;

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
                    mrH.greeting();
                }
            }

            if (alex.name.equals(typedName)) {
                if (alex.password == typedPasswordNumber) {
                    alex.present = true;
                    alex.greeting();
                }
            }

            if (aman.name.startsWith(typedName)) {
                if (aman.password == typedPasswordNumber) {
                    aman.present = true;
                    aman.greeting();
                }
            }

            if(Zhang.name.equals(typedName)){
                if(Zhang.password == typedPasswordNumber){
                    Zhang.present = true;
                    Zhang.status();
                }
            }

            if(tai.name.equals(typedName)){
                if(tai.password == typedPasswordNumber){
                    tai.present = true;
                    tai.status();
                }
            }

            if(Kabir.name.equals(typedName)){
                if(Kabir.password == typedPasswordNumber){
                    Kabir.present = true;
                    Kabir.status();
                }
            }

            // 4. Get typing input to check for your name/password/presence

        }
    }
}