public class Student extends Person{
    private String major = "";

    public Student(){}

    public Student(String name, int birthYear, String major){
        super(name, birthYear);
        this.major=major;
    }

    public void setMajor(String major){
        this.major=major;
    }

    public String getMajor(){
        return major;
    }

    public String toString(){
        return super.toString() + ", " + major;
    }

}
