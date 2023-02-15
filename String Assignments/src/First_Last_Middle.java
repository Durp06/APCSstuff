import java.util.*;
public class First_Last_Middle {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner (System.in);
        String glop = "";
        char first = ' ';
        String mid = "";
        char last = ' ';
        System.out.print("Enter your word: ");
        glop = keyboard.nextLine();

        first = glop.charAt(0);
        last = glop.charAt(glop.length()-1);
        mid = glop.substring(1, glop.length()-1);

        System.out.println(first + " " + last + " " + mid);
    }
    }