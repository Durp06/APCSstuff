public class Motorcycle extends Vehicle {
    private int cc=0;

    public Motorcycle(){

    }

    public Motorcycle(String make, String model, int year, int power, int cc ){
        super(make, model, year, power);
        this.cc=cc;
    }

    public String toString(){
        return super.toString()+ ", " + cc;
    }
}
