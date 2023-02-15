import java.util.Arrays;
import java.util.*;
public class ArrModeMedian {

	public static void main(String[] args) {
		int[] numbers = {1,6,9,17,3,9};
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("The mode is: " + getMode(numbers));
		System.out.println("The median is: " + getMedian(numbers));
		System.out.println("The Standard Deveation is: " + getSD(numbers));
		System.out.println("The Z-Scores are: " + Arrays.toString(getZScore(numbers)));
		
	}
	
	public static int getMode(int[] numbers) {
	int[] frequency = new int[numbers.length];
	int mode = 0;
	int highestIndex=0;
	for (int i=0; i<numbers.length; i++) {
		for(int j=0; j<numbers.length; j++) {
			if (numbers[i] == numbers[j]) {
				frequency[i]++;
				highestIndex=i;	
				mode = numbers[i];
			}
		}
	}
	
	
	return mode;
	
	}
	
	public static double getMedian (int[] numbers) {
		int[] frequency = new int[numbers.length];
		int highestNum = 0;
		int index = 0;
		double mid=0.0;
		if(numbers.length%2==0) {
			//even
			mid = (numbers[numbers.length/2] + numbers[numbers.length/2-1])/2;
		}
		else {
			//odd
			mid = numbers[0]+(numbers.length-1-numbers[0])/2;
		}
			
		return mid;
	}
	
	public static double getSD (int[] numbers) {
		int mean=0;
		int sum=0;
		int count=0;
		int squaredSums = 0;
		int variance = 0;
		double sd=0.0;
		int[] difference = new int [numbers.length];
		
		for (int i=0; i<numbers.length; i++) {
			sum+=numbers[i];
			count++;
		}
		mean = sum/count;
		for (int i=0; i<numbers.length; i++) {
			difference[i]=numbers[i]-mean;
		}
		int[]sqrdNums = new int [difference.length];
		
		for (int i=0; i<difference.length; i++) {
			sqrdNums[i]=difference[i]*difference[i];
		}
		
		for (int i=0; i<sqrdNums.length-1; i++) {
			squaredSums+=sqrdNums[i]+sqrdNums[i+1];
		}
		variance = squaredSums/count;
		sd = Math.sqrt(variance);
		return sd;
	}
	
	public static double[] getZScore (int[] numbers) {
		double sd=getSD(numbers);
		double score =0.0;
		double mean = 0.0;
		double count=numbers.length;
	
		double[] z = new double[numbers.length];
		
		for (int i=0; i<numbers.length; i++) {
			score+=numbers[i];
		}
		mean = score/count;
		for (int i=0; i<numbers.length; i++) {
			z[i]=(numbers[i]-mean)/sd;
		}
		return z;
	}
	
	
}
