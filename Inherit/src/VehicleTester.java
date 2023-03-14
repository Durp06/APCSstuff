public class VehicleTester {
    public static void main (String[] args){
        Vehicle car = new Vehicle("Honda", "Civic", 2013, 1);
        Motorcycle b = new Motorcycle("Harley", "Sportster", 2023, 1, 1200);
        b.setYear(2022);
        System.out.print(b);
    }
}
