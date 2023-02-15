import java.util.*;
public class StoI {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner (System.in);
        String number = "";

        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        number = keyboard.nextLine();
        String including = "";

        for (int i=0; i<number.length(); i++){
            if (number.charAt(i) != ','){
                including += number.charAt(i) + "";
            }
        }
        Integer.parseInt(including);
        System.out.println(including);
    }
}