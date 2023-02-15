import java.util.Scanner;
public class ArrayProblems {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in); 
		int [] numbers = {10, 15, -13, 134, -2, 5, 14, 88};
		int [] personNums = new int[10];
		
		for (int i=0; i<personNums.length; i++) {
			System.out.print("Input number for index " + i + " ");
			personNums[i] = Integer.parseInt(keyboard.nextLine());
		}
		
		int [] evens= new int[10];
		int [] odds = new int[10];
		int [] negatives = new int[10];
		
	}
	
	public static boolean isOdd (int sum) {
		if (sum%2!=0) {
			return true;
		}
		return false;
	}
	
	public static boolean isNegative (int sum){
		
		if (sum<0) {
			return true;
		}
		return false;
	}
	{
		

	if(isOdd(personNums[i])== true) {
		
	}
	
}
	}