import java.util.Arrays;
public class Arrayss {
	private int[] values;
	public Arrayss(int[] numbers){ 
		values = numbers; 
		}
	
	public static int[] swapFirstAndLast(int[] values) {
		int first = values[0];
		int last = values[values.length-1];
		
		values[0] = last;
		values[values.length-1] = first;
		return values;
	}
	
	public static int[] evenToZero(int[] values) {
		for(int i=0; i<values.length; i++) {
			if (values[i]%2==0) {
				values[i]=0;
			}
		}
		return values;
	}
	
	public static int[] removeMid(int[] values) {
		int[] finalReturn = null;
		int[] even = new int[values.length-2];
		int[] odd = new int[values.length-1];

		for(int i=0; i<values.length-2; i++) {
			if (values[i]%2==0) {
				if (values[i]!=values[values.length/2] || values[i]!=values[values.length/2-1]) {
					even[i]=values[i];
					finalReturn = even;
				}
				
			}
		}
		for(int i=0; i<values.length-1; i++) {
			if (values[i]%2!=0) {
				if (values[i]!=values[values.length/2]) {
					odd[i]=values[i];
					finalReturn = odd;
				}
				
			}
		}
		
		return finalReturn;
		
	}
	public static int secondLargest(int[] values) {
		Arrays.sort(values);
		int largest = values[values.length-1];
		int second = 0;
		for (int i=0; i<values.length; i++) {
			if (values[i]<largest && values[i]>second) {
				second = values[i];
			}
		}
		return second;
	}
	
	public static boolean isSorted(int[] values) {
		  for (int i = 1; i < values.length; i++) {
		    if (values[i] < values[i - 1]) {
		      return false;
		    }
		  }
		  return true;
		}
	
	public static boolean isDuplicates(int[] values) {
		boolean isTrue = false;
		for(int i=0; i<values.length-1; i++) {
			if (values[i]==values[i+1]) {
				isTrue=true;
			}
		}
		return isTrue;
	}
	
	public static void shiftRight(int[] values) {
		  int last = values[values.length - 1];
		  for (int i=values.length - 1; i>0; i--) {
		    values[i] = values[i - 1];
		  }
		  
		  values[0] = last;
		}

	public static void replaceWithLargerNeighbor(int[] values) {
		  values[1] = Math.max(values[0], values[1]);
		  values[values.length - 2] = Math.max(values[values.length - 2], values[values.length - 1]);
		  for (int i = 2; i < values.length - 2; i++) {
		   
		    values[i] = Math.max(values[i - 1], values[i + 1]);
		  }
		}
	
	public static boolean isAdjacentDuplicate (int[] values) {
		boolean isDuplicate = false;
		for(int i=0; i<values.length-1; i++) {
			if(values[i]==values[i+1]) {
				isDuplicate = true;
			}
		}
		return isDuplicate;
	}
	
	public static int[] moveEvensToFront (int[] values) {
		int[] newArr = new int[values.length];
		int evenCounter = 0;
		int oddCounter = 0;
		
		for (int i=0; i<values.length; i++) {
			if(values[i]%2==0) {
				evenCounter++;
			}
			else if(values[i]%2!=0) {
			oddCounter++;
			}
		}
		int[] oddArr = new int[oddCounter];
		int[] evenArr = new int[evenCounter];
		
		for(int i=0; i<evenArr.length; i++) {
			if(values[i]%2==0) {
				evenArr[i]=values[i];
			}
		}
		for(int i=0; i<oddArr.length; i++) {
			if(values[i]%2!=0) {
				oddArr[i]=values[i];
			}
		}
		
		for(int i=0; i<evenArr.length; i++) {
			newArr[i]=evenArr[i];
		}
		
		for(int i=evenArr.length, j=0; i<(oddArr.length+evenArr.length); i++, j++) {
			newArr[i] = oddArr[j];
		}
		
	
		return newArr;
	}
	
}




