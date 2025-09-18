import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Good morning!");
        System.out.println("Let's take attendance...");

        // 1. Create an Object for yourself
        // 2. Store YOUR values in YOUR object
        // 3. Add yourself to the correct ArrayList
        Teacher mrH = new Teacher();
        String myName = "Mr. Hernandez";
        System.out.println(myName);
        mrH.name = myName;
        mrH.present = false;
        System.out.println(mrH.present);
        mrH.password = 9884;
        System.out.println(mrH.password);
        System.out.println(mrH);

        Teacher mrReddy = new Teacher();
        mrReddy.name = "Mr. Hernandez";
        mrReddy.present = false;
        mrH.password = 4321;
        System.out.println(mrReddy);

        if (mrH == mrReddy) {
            System.out.println("That makes no sense");
        }

        if (mrH.toString() == mrReddy.toString()) {
            System.out.println("Their names are the same.");
        }

        if (mrH.toString().equals(mrReddy.toString())) {
            System.out.println("Their names are the same.");
        }

        mrH.greeting();

        ArrayList<PersonWhoCanSignIn> everyone;
        everyone = new ArrayList<PersonWhoCanSignIn>();
        everyone.add(mrH);

        ArrayList<Student> students = new ArrayList<Student>();
        //students.add(mrH);

        Student alex = new Student();
        alex.name = "Alexander Chancey";
        alex.grade=10;
        alex.password = 7373;
        alex.present = false;
        everyone.add(alex);
        students.add(alex);

        Student aman = new Student();
        aman.name = "Aman Easterling";
        aman.grade=12;
        aman.password = 5259;
        aman.present = false;
        everyone.add(aman);
        students.add(aman);

        Student Zhang = new Student();
        Zhang.name = "Minghao";
        Zhang.password = 1234;
        Zhang.present = false;
        Zhang.grade = 12;
        everyone.add(Zhang);
        students.add(Zhang);

        Student harry = new Student();
        harry.name = "Harry";
        harry.present = false;
        harry.password = 0000;
        everyone.add(harry);
        students.add(harry);

        Student tai = new Student();
        tai.name = "Tai";
        tai.present = false;
        tai.grade = 12;
        tai.password = 1212;
        everyone.add(tai);
        students.add(tai);

        Student Kabir = new Student();
        Kabir.name = "Adil";
        Kabir.present = false;
        Kabir.grade = 12;
        Kabir.password = 4167;
        everyone.add(Kabir);
        students.add(Kabir);

        Student Sam = new Student();
        Sam.name = "Sam";
        Sam.grade = 12;
        Sam.present = false;
        Sam.password = 1111;
        everyone.add(Sam);
        students.add(Sam);

        // 1. Create an Object for yourself
        // 2. Store YOUR values in YOUR object
        // 3. Tell YOUR object to announce themselves

        Scanner myTextScanner = new Scanner(System.in);  // Create a Scanner object
        boolean notDoneYet = true;
        while (notDoneYet) {
            System.out.print("Type your name or DONE:");
            String typedName = myTextScanner.nextLine();
            if (typedName.equals("DONE")) {
                notDoneYet = false;
                //for (int i = 0; i < allStudents.size() ; i = i + 1) {
                //    Student eachStudent = allStudents.get(i);
                //    eachStudent.status();
                //}
                for (PersonWhoCanSignIn eachPerson : everyone) {
                    eachPerson.status();
                }
                continue;
            }
            // Read user input
            System.out.print("Type your password:");
            String typedPassword = myTextScanner.nextLine();  // Read user input

            boolean foundStudent = false;
            for (Student eachStudent : students) {
                if (eachStudent.name.equals(typedName) && eachStudent.password == Integer.valueOf(typedPassword)) {
                    eachStudent.present = true;
                    //System.out.println(eachStudent.name + " marked present.");
                    eachStudent.greeting();
                    foundStudent = true;
                }
            }
            if (!foundStudent) {
                System.out.println(typedName + " OR " + typedPassword + " are wrong");
            }
        }
    }
}