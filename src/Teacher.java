import java.util.ArrayList;

class Teacher extends PersonWhoCanSignIn {
    private ArrayList<Student> students = new ArrayList<Student>();

    public Teacher() {
        super();
    }

    public Teacher(String name, boolean present, int password) {
        super(name, present, password);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    void status() {
        System.out.println("Teacher: " + name + " is Present: " + present);
    }

    void greeting() {
        System.out.println("Hello Class! " + " In case you forgot name, it's " + name + "Let's get started.");
    }

    void chargeFees(ArrayList<Student> studentsToCharge) {
        // which students have filled out the form (name + $?? + credit/debit number)
        for (Student eachFeePayingStudent : studentsToCharge) {
            eachFeePayingStudent.payFees(40);
        }
        // which credit card or debit card to use

    }

    public void takeAttendance() {
        for (Student presentStudent : students) {
            System.out.println(presentStudent + " is present");
        }
    }

    public String toString() {
        String niceString = "Teacher ";
        niceString += name;
        return niceString;
    }

    void usePhoneDuringClass() {
        //students.get(0).creditCardNumber
        System.out.println("Buy sneakers using credit card #" + students.get(0).getCreditCardNumber(this));
    }
}
