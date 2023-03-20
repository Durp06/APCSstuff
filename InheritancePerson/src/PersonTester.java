public class PersonTester {
    public static void main(String[] args) {
        Person Ron = new Person ("Ron", 1984);
        Student Ryan = new Student ("Ryan", 202, "Biomechanical Engineering");
        Instructor William = new Instructor ("William", 6873, 120999.99);

        System.out.println(Ryan);
        System.out.println(Ron);
        System.out.println(William);
        System.out.println(William.compareTo(Ryan));
    }
}
