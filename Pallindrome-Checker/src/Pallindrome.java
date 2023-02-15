import java.util.*;
public class Pallindrome {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String pallindrome = "";
        System.out.print("Input your words, I will tell you if it is a pallindrome: ");
        pallindrome = scan.nextLine();
        
        System.out.println(isPallindrome(pallindrome));

    }

    public static boolean isPallindrome(String original){
         original = original.toLowerCase();
         String o = "";
        for (int i = 0; i<original.length(); i++){
            if( Character.isLetterOrDigit(original.charAt(i))){
            o+=original.charAt(i);
            }
        }
     System.out.print(o);

        for(int i=0, j=o.length()-1; i<o.length()/2;i++, j--){

            if(o.charAt(i) != o.charAt(j)){
                System.out.print("\nPallindrome = ");
                return false;
            }
        }
        System.out.print("\nPallindrome = ");
        return true;

    
        
     
    }
}

