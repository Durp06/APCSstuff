import java.util.*;
public class Path {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner (System.in);
       String driveLetter = "";
       String path = "";
       String fileName = "";
       String extension = "";
       
        System.out.print("Please enter the drive letter: ");
        driveLetter = keyboard.nextLine();

        System.out.print("\nPlease enter the path (input\\input): ");
        path = keyboard.nextLine();

        System.out.print("\nPlease enter the file name: ");
        fileName = keyboard.nextLine();

        System.out.print("\nPlease enter the extention: ");
        extension = keyboard.nextLine();
        

        System.out.println(driveLetter + ":\\" + path + "\\" + fileName + "." + extension);
    }
}
