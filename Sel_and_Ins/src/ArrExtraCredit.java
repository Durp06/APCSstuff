import java.util.*;
public class ArrExtraCredit {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		Random rand = new Random();
		int user = 0;
		double before_time = 0.0;
		double after_time = 0.0;
		double total_time = 0.0;
		
		System.out.print("Input the array length: ");
		user = keyboard.nextInt();
		
		int[] arr = new int[user];
		double[] Selection_Sort_Time = new double[40];
		long[] Selection_Sort_Swaps = new long[40];
		long[] Selection_Sort_Compare = new long[40];
		
		double[] Insertion_Sort_Time = new double[40];
		long[] Insertion_Sort_Swaps = new long[40];
		long[] Insertion_Sort_Compare = new long[40];
		
		
		
		System.out.println("Selection Sort Now");
		for (int i=0; i<40; i++) {
			Sorts.selection_swaps=0;
			Sorts.selection_compare=0;
			for (int j=0; j<arr.length; j++) 
				arr[j] = rand.nextInt(1, 901);
			before_time = System.currentTimeMillis(); 
			Sorts.selectionSort(arr);
			after_time = System.currentTimeMillis();
			total_time = after_time-before_time;
			Selection_Sort_Time[i] = total_time;
			System.out.println(i + "/40");
			Selection_Sort_Swaps[i]=Sorts.selection_swaps;
			Selection_Sort_Compare[i]=Sorts.selection_compare;
		}
		
		System.out.println("Insertion Sort Now");
		for (int i=0; i<40; i++) {
			Sorts.insertion_swaps=0;
			Sorts.insertion_compare=0;
			for (int j=0; j<arr.length; j++)
				arr[j] = rand.nextInt(1, 901);
			
			before_time = System.currentTimeMillis(); 
			Sorts.insertionSort(arr);
			after_time = System.currentTimeMillis();
			total_time = after_time-before_time;
			Insertion_Sort_Time[i] = total_time;
			System.out.println(i + "/40");
			Insertion_Sort_Swaps[i]=Sorts.insertion_swaps;
			Insertion_Sort_Compare[i]=Sorts.insertion_compare;
				
		}
		
		System.out.println("Average Selection Time: " + getAverage(Selection_Sort_Time) + "miliseconds");
		System.out.println("Average Selection Sorts: " + getAverage(Selection_Sort_Swaps));
		System.out.println("Average Selection Comparisons: " + getAverage(Selection_Sort_Compare));
		
		System.out.println("Average Insertion Time: " + getAverage(Insertion_Sort_Time) + "miliseconds");
		System.out.println("Average Insertion Sorts: " + getAverage(Insertion_Sort_Swaps));
		System.out.println("Average Insertion Comparisons: " + getAverage(Insertion_Sort_Compare));
	}
	
	public static double getAverage(double[] arr) {
		double sum = 0;
		double avg = 0;
		
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		avg = sum/arr.length;
		return avg;
	}
	
	public static double getAverage(long[] arr) {
		double sum = 0;
		double avg = 0;
		
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		avg = sum/arr.length;
		return avg;
	}
}
