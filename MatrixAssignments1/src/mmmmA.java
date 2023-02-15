import java.util.*;
public class mmmmA {

		public static void main (String[] args) {
			Scanner in = new Scanner(System.in);
			//Declare
			int[][]matt=new int [2][2];		//nxn grid n^2 total
			int
			[][] another= {{1,2,3},{4,5,6},{7,8,9}};
			
			//row major traversal
			for(int r=0; r<matt.length; r++) {				//does row then does all columns in row
				for (int c=0; c<matt[r].length; c++) {
					matt[r][c]=in.nextInt();
			}
		}
			//column major traversal
			for (int c=0; c<matt[0].length; c++) {
				for (int r=0; r<matt.length; r++) {
					
				}
			}
			
			System.out.println(Arrays.deepToString(another));
			
			for (int[]temp:matt) {
				for (int i:temp) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
				
	}
			
}
