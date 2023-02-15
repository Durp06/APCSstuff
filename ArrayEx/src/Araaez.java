import java.util.Scanner;
public class Araaez {
public static void main(String[] args) throws Exception {
         Scanner scan = new Scanner (System.in);
        int[] list = new int[10];
        String[] b = {"huey", "leuy", "dooey"};
        int sum = 0;
        for (int i=0; i<list.length; i++){
            list[i]=scan.nextInt();
            sum += list[i];
        }

        for (int i=0; i<list.length; i++){
            System.out.print("Index @ " + i + "is " + list[i] + " ");
        }
    }
}
