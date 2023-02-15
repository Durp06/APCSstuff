import java.util.Arrays;
import java.util.Scanner;
public class ArrayProblems {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in); 
		int [] numbers = {10, 15, -13, 134, -2, 5, 14, 88, 0, -99};
		int e = 0;
		int o = 0;
		int n = 0;
		int oddp=0;
		int evenp=0;
		int negp=0;
		for (int j=0; j<numbers.length; j++) {
			if (isOdd(numbers[j])==false) {
				e++;
			}
			if (isOdd(numbers[j])==true) {
				o++;
			}	
			if (isNegative(numbers[j])==true) {
				n++;
			}
		}
		
		int [] personNums = new int[10];
		int [] evens= new int[e];
		int [] odds = new int[o];
		int [] negatives = new int[n];
		int [] greaterThan = new int [10];
		double finalSum = 0;
		
		System.out.println(e +"\n" + o + "\n" + n);
		for (int i=0; i<personNums.length; i++) {
			System.out.print("Input number for index " + i + " ");
			personNums[i] = Integer.parseInt(keyboard.nextLine());
			int x = numbers[i];
		}
		
		for (int i = 0; i < numbers.length; i++)
		{
			if (isOdd(numbers[i]))
			{
				odds[oddp] = numbers[i];
				oddp++;
			}
			
			if (!isOdd(numbers[i]))
			{
				evens[evenp] = numbers[i];
				evenp++;
			}
			
			if (isNegative(numbers[i]))
			{
				negatives[negp] = numbers[i];
				negp++;
			}
		}
		System.out.println();
		System.out.println("The even numbers are:" + Arrays.toString(evens));
		System.out.println("The odd numbers are:" + Arrays.toString(odds));
		System.out.println("The negative numbers are:" + Arrays.toString(negatives));
//		for (int i=0; i<negatives.length; i++) {
//			System.out.println("Negative: " + negatives[i]);
//			finalSum+=negatives[i];
//			
//		}
//		
//		for (int i=0; i<evens.length; i++) {
//			System.out.println("Even: " + evens[i]);
//			finalSum+=evens[i];
//		}
//
//		for (int i=0; i<odds.length; i++) {
//			System.out.println("Odd: " + odds[i]);
//			finalSum+=odds[i];
//		}
		System.out.println("The sum is: " + finalSum);
		System.out.println("The average is: " + (finalSum/personNums.length));
		
		for (int i=0; i<personNums.length; i++) {
			if(personNums[i]>(finalSum/personNums.length)){
				greaterThan[i] = personNums[i];
				System.out.println(greaterThan[i] + " is greater than the average");
			}
			
		}
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

	
	}


