import java.util.*;
public class Monograms {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner (System.in);
        String name = "";

        System.out.print ("Enter your First Middle Last names: ");
        name = keyboard.nextLine();

        String[] glops = name.split(
        		" ");
        String initials = "";

        for (int i=0; i<glops.length; i++){
            initials += glops[i].charAt(0) + "";

        }
        System.out.println(initials);
    }
}