import java.util.Random;
import java.util.Scanner;

public class Penny_Toss_2_player {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner (System.in);
		
		Random random = new Random();
        int numberRow = 0;
        int numberCol = 0;
        int score1 = 0;
        int score2=0;
        
        int[][] board = {
        	{1, 1, 1, 1, 1,},
        	{1, 2, 2, 2, 1,},
        	{1, 2, 3, 2, 1,},
        	{1, 2, 2, 2, 1,},
        	{1, 1, 1, 1, 1}
        };
        
        int rounds = 0;
        int pennies1 = 0;
        int pennies2 = 0;
        
        System.out.println("Hello, welcome to the penny game. Here is the board:");
        System.out.println(
        		"1 1 1 1 1\r\n"
        		+ "1 2 2 2 1\r\n"
        		+ "1 2 3 2 1\r\n"
        		+ "1 2 2 2 1\r\n"
        		+ "1 1 1 1 1");
        System.out.print("How many rounds would you like to play: ");
        rounds = scan.nextInt();
        System.out.println();
        
        for (int i=0; i<rounds; i++) {
        	System.out.println("Player 1 toss " + (i+1));
        	System.out.print("How many pennies would you like to toss: ");
        	pennies1 = scan.nextInt();
        	
        	if (pennies1 >3) {
        		System.out.println("Over 3 pennis is OP, cmon bro");
        		System.out.println("You lose your turn");
        		System.out.println("");
        	}
        	else {
        	for (int j=0; j<pennies1; j++) {
        	numberRow = random.nextInt(board.length);
        	numberCol = random.nextInt(board.length);
        	score1 += board[numberRow][numberCol];
        	Thread.sleep(2000);
        	System.out.println("You landed on " + board[numberRow][numberCol]);
        	board[numberRow][numberCol] = 0;
        	format(board);
        	System.out.println("Your score is: " + score1);
        	System.out.println();
        	}
        	}
           	System.out.println("Player 2 toss " + (i+1));
        	System.out.print("How many pennies would you like to toss: ");
        	pennies2 = scan.nextInt();
        	
        	if (pennies2 >3) {
        		System.out.println("Over 3 pennis is OP, cmon bro");
        		System.out.println("You lose your turn");
        		System.out.println("");
        	}
        	
        	else {
        	for (int j=0; j<pennies2; j++) {
        	numberRow = random.nextInt(board.length);
        	numberCol = random.nextInt(board.length);
        	score2 += board[numberRow][numberCol];
        	Thread.sleep(2000);
        	System.out.println("You landed on " + board[numberRow][numberCol]);
        	board[numberRow][numberCol] = 0;
        	format(board);
        	System.out.println("Your score is: " + score2);
        	System.out.println();
        	}
        	}
 
        }
        
        System.out.println("Player 1 final score is: " + score1 + " and Player 2 final score is " + score2);
        if (score1>score2) {
        	System.out.println("Player 1 wins!");
        }
        else if (score1<score2) {
        	System.out.println("Player 2 wins!");
        }
        else
        	System.out.println("It's a tie");
        
        
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

