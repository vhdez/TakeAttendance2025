class Student extends PersonWhoCanSignIn{
    private int grade;
    private long creditCardNumber;

    public Student(String name, boolean present, int password, int grade, long creditCardNumber) {
        super(name, present, password);
        this.grade = grade;
        this.creditCardNumber = creditCardNumber;
    }

    public Student(String name, boolean present, int password, int grade) {
        super(name, present, password);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public long getCreditCardNumber(Teacher teacher) {
        // RUN ANY SECURITY CODE I WANT
        if (teacher.getName().equals("Mr.Reddy ")) {
            System.out.println(teacher + " is trusted and got my credit card.");
            return creditCardNumber;
        } else {
            System.out.println(teacher + "is NOT trusted trying and DID NOT get my credit card.");
            return 0L;
        }
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    void greeting() {
        super.greeting();
        System.out.println("Yo! It's " + name + "! Wasssssup?");
    }

    void status() {
        System.out.println("Student: " + name + " Grade: " + grade + "th Present: " + present);
    }

    void payFees(int amount) {
        // use your credit card
        System.out.println("Charging $" + amount + " to " + name + "'s credit card number #" + creditCardNumber);
    }
}
