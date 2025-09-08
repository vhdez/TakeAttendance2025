import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Good morning!");
        System.out.println("Let's take attendance...");
        System.out.println("Aman is present");
        System.out.println("Harry is present!");
        System.out.println("Minghao is maybe present!");
        System.out.println("Harry Grade 11 is present!");
        System.out.println("Minghao Grade  12 is maybe present!");
        System.out.println("Alex is present");
        Teacher mrH = new Teacher();
        mrH.name = "Mr. Hernandez";
        mrH.present = true;
        mrH.status();

        System.out.println("Tai is present");
        System.out.println("Adil is present.");


        Scanner myTextScanner = new Scanner(System.in);  // Create a Scanner object
        boolean notDoneYet = true;
        while (true) {
            System.out.print("Taking attendance.  Type your name: OR Teacher, type DONE");
            String nameTyped = myTextScanner.nextLine();  // Read user input
            if (nameTyped.equals("DONE")) {
                // STOP THIS LOOP
                notDoneYet = false;
            } else {
                System.out.println(nameTyped + " is present!");
            }
        }


    }
}