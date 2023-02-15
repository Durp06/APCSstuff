import java.util.Arrays;
public class MattyDread {

	public static void main(String[] args) {

int [][] sq=new int[4][4];
//declaration
int [][] sq2= {{1, 2,3,4},
		{4,3,2,1},
		{5,6,7,8},
		{8,7,6,5}};
//initializer

for (int row=0; row <sq2.length;row ++) {
	for (int col=0; col<sq2[row].length; col++) {
		System.out.print(sq2[row][col] + " ");
	}
	System.out.println();
}

for(int col=0; col<sq2[0].length; col++) {
	for(int row=0; row < sq2.length; row++) {
		System.out.print(sq2[row][col] + " ");
	}
	System.out.println();
}
for (int row=0; row<sq2.length;row++) {
	System.out.println(Arrays.toString(sq2[row]));
}
System.out.println(Arrays.deepToString(sq2));
	

	for (int [] row: sq2) {
		for (int val: row) {
		}
	}
		}
}

	


