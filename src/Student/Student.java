package Student;

abstract class Student {
    protected String firstName;
    protected String lastName;
    protected String cohort;
    protected String computer;
    protected String graduated;

    public abstract void greeting();
    public abstract void study();
    public abstract boolean giveBusinessCards();

}

//hello world