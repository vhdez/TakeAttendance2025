import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Good morning!");
        System.out.println("Let's take attendance...");

        ArrayList<Student> feesSignupList = new ArrayList<Student>();

        // 1. Create an Object for yourself
        // 2. Store YOUR values in YOUR object
        // 3. Add yourself to the correct ArrayList
        Teacher mrH = new Teacher();
        String myName = "Mr. Hernandez";
        System.out.println(myName);

        mrH.setName(myName);
        mrH.setPresent(false);
        System.out.println(mrH.isPresent());
        mrH.setPassword(9884);
        System.out.println(mrH.getPassword());
        System.out.println(mrH);

        Teacher mrReddy = new Teacher("Mr. Reddy",false,4321);
        System.out.println(mrReddy);

        ArrayList<PersonWhoCanSignIn> everyone;
        everyone = new ArrayList<PersonWhoCanSignIn>();
        everyone.add(mrH);

        ArrayList<Student> students = new ArrayList<Student>();
        //students.add(mrH);

        Student alex = new Student("Alexander Chancey", false, 7373, 10, 574388L);
        everyone.add(alex);
        students.add(alex);
        feesSignupList.add(alex);

        Student aman = new Student("Aman Easterling", false, 5259, 12);
        everyone.add(aman);
        students.add(aman);

        Student Zhang = new Student("Minghao", false, 1234, 12, 1234567890);
        everyone.add(Zhang);
        students.add(Zhang);
        feesSignupList.add(Zhang);

        Student harry = new Student("Harry", false, 0000, 11);
        everyone.add(harry);
        students.add(harry);

        Student tai = new Student("Tai", false, 1212, 12, 564768594l);
        everyone.add(tai);
        students.add(tai);

        Student Kabir = new Student("Adil", false , 4167, 12);
        everyone.add(Kabir);
        students.add(Kabir);

        Student Sam = new Student("Sam", false , 1111, 12);
        everyone.add(Sam);
        students.add(Sam);

        mrReddy.chargeFees(feesSignupList);
        mrH.greeting();
        mrH.getStudents().add(alex);
        mrH.getStudents().add(Zhang);

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
                if (eachStudent.getName().equals(typedName) && eachStudent.getPassword() == Integer.valueOf(typedPassword)) {
                    eachStudent.setPresent(true);;
                    //System.out.println(eachStudent.name + " marked present.");
                    eachStudent.greeting();
                    foundStudent = true;
                }
            }
            if (!foundStudent) {
                System.out.println(typedName + " OR " + typedPassword + " are wrong");
            }
        }

        mrH.takeAttendance();
        mrH.usePhoneDuringClass();

    }

}