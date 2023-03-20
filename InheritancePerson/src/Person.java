public class Person implements Comparable <Person> {
    private String name = "";
    private int birthYear = 0;

    public Person (){}

    public Person (String name, int birthYear){
        this.name=name;
        this.birthYear=birthYear;
    }

    public String toString(){
        return name + ", " + birthYear;
    }

    public void setName(String name){
        this.name=name;
    }
    
    public void setYear(int year){
        this.birthYear=year;
    }

    public String getName(){
        return name;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public int compareTo(Person b){
        if (birthYear==b.getBirthYear())
            return 0;
        else if (birthYear<b.getBirthYear())
            return -1;
        else
            return 1;
    }

}
