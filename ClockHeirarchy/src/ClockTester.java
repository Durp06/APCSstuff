public class ClockTester {
    public static void main(String[] args) throws Exception {
        Clock korben = new Clock ();
        WorldClock maddox = new WorldClock(5, "Panama");
        System.out.println("My Time: " + korben.getTime());
        System.out.println("Time: " + maddox.getTime());
    }
}
