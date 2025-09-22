class PersonWhoCanSignIn {
    protected String name;
    protected boolean present;
    protected int password;

    public PersonWhoCanSignIn() {
    }

    public PersonWhoCanSignIn(String name, boolean present, int password) {
        this.name = name;
        this.present = present;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

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
