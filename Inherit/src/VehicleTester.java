public class VehicleTester {
    public static void main (String[] args){
        Vehicle car = new Vehicle("Honda", "Civic", 2013, 1);
        Motorcycle b = new Motorcycle("Harley", "Sportster", 2023, 1, 1200);
        Comparable c = new Motorcycle("Toyota", "IG", 2023, 1, 2023);
        ((Vehicle)c).setYear(2022);
        System.out.print(b);
        System.out.println(car.compareTo(((Vehicle)c)));
    }
}
