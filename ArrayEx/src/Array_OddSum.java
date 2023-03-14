import java.util.Scanner;
public class Array_OddSum {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int[] num =new int[10];
		int finalNumber = 0;
		int F = 0;
	
	
	for (int i=0; i<num.length; i++) {
		System.out.print("Input number for index " + i + " ");
		num[i] = Integer.parseInt(keyboard.nextLine());
		
		if (isOdd(num[i]) == true) {
			finalNumber+=num[i];
		}
		
	}
	System.out.println("The total of the odd index's is: " + finalNumber);
	}
	public static boolean isOdd (int sum) {
			if (sum%2!=0) {
				return true;
			}
			return false;
		}
	
}
