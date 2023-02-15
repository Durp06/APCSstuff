import java.util.Arrays;
import java.util.Scanner;

public class Magic_Square {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int dimensions = 0;	
		System.out.print("How many rows and columns would you like your square to have: ");
		dimensions = in.nextInt();
		
		int[][]matrix=new int [dimensions][dimensions];
		int[][] square= {
				{16, 3, 2, 13},
				{5, 10, 11, 8},
				{9, 6, 7, 12},
				{4, 15, 14, 1}
		};
		
		System.out.println("Input the numbers for your " + matrix.length + " x " + matrix.length + " magic square");
		for(int r=0; r<matrix.length; r++) {//horizontal sums				//does row then does all columns in row
			for (int c=0; c<matrix[r].length; c++) {
				System.out.print("[" + r + ", " + c + "]: ");
				matrix[r][c]=in.nextInt();
		}
	}
		
		int rowSum=0;
		int colSum=0;
		int diag1=0;
		int diag2=0;
		int[]sums = new int[(matrix.length*2)+2];
		
		for(int r=0; r<matrix.length; r++) {//horizontal sums				//does row then does all columns in row
			for (int c=0; c<matrix[r].length; c++) {
				rowSum+=matrix[r][c];
				sums[r]=rowSum;
		
		}
			rowSum=0;
	}
		for (int c=0; c<matrix[0].length; c++) { //vertical sums
			for (int r=0; r<matrix.length; r++) {
				colSum+=matrix[r][c];
				sums[c+matrix.length]=colSum;
			}
			colSum=0;
		}
	
		
		for(int r=0; r<matrix.length; r++) {
				diag1+=matrix[r][r];
				sums[sums.length-2]=diag1;
	}
		for(int r=matrix.length-1, c=0; c<matrix.length; r--, c++) {//horizontal sums				//does row then does all columns in row
			diag2+=matrix[r][c];
			sums[sums.length-1]=diag2;
}
		
	System.out.println(Arrays.toString(sums));
	System.out.print("Is Magic Square: " +  isMagicSquare(sums));
		
	
	}
	public static boolean isMagicSquare(int[] arr) {
		int magicNum = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (magicNum !=arr[i])
				return false;
		}
		return true;
	}

}
