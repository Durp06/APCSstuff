import java.util.Arrays;

public class ArrayssTest {

	public static void main(String[] args) {
		int[] numbers ={3,7,6,9,2};
		int temp = 0;
		
		System.out.println("Ex. " + Arrays.toString(numbers));
		Arrayss.swapFirstAndLast(numbers);
		System.out.println("\na. " + Arrays.toString(numbers));
		Arrayss.evenToZero(numbers);
		System.out.println("\nb. " + Arrays.toString(numbers));
		Arrayss.removeMid(numbers);
		System.out.println("\nc. " + Arrays.toString(numbers));
		System.out.println("\nd. " + Arrayss.secondLargest(numbers));
		System.out.println("\ne. " + Arrayss.isDuplicates(numbers));
		System.out.println("\nf. " + Arrayss.isSorted(numbers));
		Arrayss.shiftRight(numbers);
		System.out.println("\ng. " + Arrays.toString(numbers));
		Arrayss.replaceWithLargerNeighbor(numbers);
		System.out.println("\nh. " + Arrays.toString(numbers));
		System.out.println("\ni. " + Arrayss.isAdjacentDuplicate(numbers));
		Arrayss.moveEvensToFront(numbers);
		System.out.println("\nj. " + Arrays.toString(numbers));
	}

}    

//swap function
//int temp = 0;
//temp = numbers[min];
//numbers[min]= numbers[index];
//numbers[index] = temp; 