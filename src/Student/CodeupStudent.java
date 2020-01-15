package Student;

public class CodeupStudent extends Student{
    private final boolean graduated;
    private final String computer;
    private final String cohort;
    private final String lastName;
    private final String firstName;

    public CodeupStudent(String [] information, boolean graduated){
        this.firstName = information[0];
        this.lastName= information[1];
        this.cohort = information[2];
        this.computer = information[3];
        this.graduated = graduated;

    }

    public void greeting(){
        System.out.println("Hello, " + cohort);
    }
    public void study(){
        System.out.println("Full-Stack Java Curriculum");
    }

    public boolean giveBusinessCards(){
        boolean graduated = false;
        if(graduated){
            return true;
        }else{
            return false;
        }
    }
}
