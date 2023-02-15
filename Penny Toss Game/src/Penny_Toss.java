import java.util.*;
public class Penny_Toss {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
//		double doubleRandomNum = 0;
//		doubleRandomNum = Math.random() * 4;
//		int randomNum = (int)doubleRandomNum;
//		System.out.print(randomNum);
		
		Random random = new Random();
        int numberRow = 0;
        int numberCol = 0;
        int score = 0;
        
        int[][] board = {
        	{1, 1, 1, 1, 1,},
        	{1, 2, 2, 2, 1,},
        	{1, 2, 3, 2, 1,},
        	{1, 2, 2, 2, 1,},
        	{1, 1, 1, 1, 1}
        };
        int pennies = 0;
        
        System.out.println("Hello, welcome to the penny game. Here is the board:");
        System.out.println(
        		"1 1 1 1 1\r\n"
        		+ "1 2 2 2 1\r\n"
        		+ "1 2 3 2 1\r\n"
        		+ "1 2 2 2 1\r\n"
        		+ "1 1 1 1 1");
        System.out.print("How many pennies would you ike to toss: ");
        pennies = scan.nextInt();
        System.out.println();
        
        for (int i=0; i<pennies; i++) {
        	System.out.println("Toss number " + (i+1));
        	numberRow = random.nextInt(board.length);
        	numberCol = random.nextInt(board.length);
        	score += board[numberRow][numberCol];
        	System.out.println("You landed on " + board[numberRow][numberCol]);
        	board[numberRow][numberCol] = 0;
        	format(board);
        	
        	System.out.println("Your score is: " + score);
        	System.out.println();
 
        }
        
        System.out.println("Your final score is: " + score + " points and you used " + pennies + " pennies.");
        
        
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

//        if (number<1){
//        	number++;
//        }
//        else
//        System.out.println(number);

//for(int r=0; r<board.length; r++) {
//	for (int c=0; c<board[r].length; c++) {
//
//}
//}

