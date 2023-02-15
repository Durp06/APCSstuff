import java.util.Arrays;
import java.util.Scanner;

public class Theatre_Seating {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int chosen_col = 0;
		int chosen_row = 0;
		int price_or_specific = 0;
		int priceChosen = 0;
		int temp1 = 0;
		int temp2 = 0;
		int[][] seating= {
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10,},
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10,},
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10,},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10,},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10,},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10,},
				{20, 20, 30, 30, 40, 40, 30, 30, 20, 20,},
				{20, 30, 30, 40, 50, 50, 40, 30, 30, 20,},
				{10, 40, 50, 50, 50, 50, 50, 50, 40, 30,}

		};
		
		System.out.print(
				"			   COLUMNS\n"
				+"		  0  1  2  3  4  5  6  7  8  9\n"
				+"		---------------------------------\n"
				+ "		0|10 10 10 10 10 10 10 10 10 10\r\n"
				+ "		1|10 10 10 10 10 10 10 10 10 10\r\n"
				+ "		2|10 10 10 10 10 10 10 10 10 10\r\n"
				+ "		3|10 10 20 20 20 20 20 20 10 10\r\n"
				+ "		4|10 10 20 20 20 20 20 20 10 10\r\n"
				+ "		5|10 10 20 20 20 20 20 20 10 10\r\n"
				+ "		6|20 20 30 30 40 40 30 30 20 20\r\n"
				+ "		7|20 30 30 40 50 50 40 30 30 20\r\n"
				+ "		8|10 40 50 50 50 50 50 50 40 30\r\n"
				+ "		-------------------------------\n"
				+"			    Stage\n	"			
				+ "\n");
		System.out.print("Would you like to find a seat closest to the stage by price(1) or choose your specific seat(2)?");
		price_or_specific = in.nextInt();
		if(price_or_specific == 1) {
			System.out.print("What price would you like?: $");
			priceChosen=in.nextInt();
			for(int c=seating[0].length-1; c>0; c--) {
				for (int r=seating.length-1; r>0; r--) {
					System.out.println(r + " , " + c);
					if(seating[r][c]==priceChosen) {
						temp1 = r;
						temp2 = c;
					}
					
				}}
			System.out.println("Great, your seat is at row: " + temp1 + " and column: " + temp2);
			System.out.println("That seat is $" + seating[temp1][temp2] + ", thank you for your purchase!");
			seating[temp1][temp2]=0;	
		}
		else {
		
		System.out.print("What row would you like");
		chosen_row = in.nextInt();
		
		System.out.print("What seat would you like");
		chosen_col = in.nextInt();
		
		System.out.println("That seat is $" + seating[chosen_row-1][chosen_col-1] + " | Thank you for your purchase.");
		seating[chosen_row][chosen_col]=0;
		}
		format(seating);

		
	}
	
	public static void format(int[][] matt) {
		for(int[]row: matt) {
		for(int i: row) {
			System.out.print(i + " ");	
		}
			System.out.println();
		
		}
	}
	
}
