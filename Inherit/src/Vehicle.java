public class Vehicle {
    private String model = "";
    private String make = "";
    private int year = 0;
    private int power = 0;

public Vehicle(){

}

public Vehicle(String model, String make, int year, int power){
    this.model=model;
    this.make=make;
    this.year=year;
    this.power=power;
}

public String toString(){
    return model + " " + make + " " + year;
}

public void setMake(String make){
    this.make=make;
}

public void setModel(String model){
    this.model=model;
}

public void setYear(int year){
    this.year=year;
}

public int returnYear(){
    return year;
}

public String getMake(){
    return make;
}

public String getModel(){
    return model;
}
}
