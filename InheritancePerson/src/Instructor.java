public class Instructor extends Person {
    private double salary;

    public Instructor(){}

    public Instructor(String name, int birthYear, double salary){
        super(name, birthYear);
        this.salary=salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return super.toString() + ", $" + salary;
    }

}
