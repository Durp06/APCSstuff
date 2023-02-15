public class LightboardTest {
    
    public static void main(String[] args) throws Exception {
        Lightboard board = new Lightboard(5, 5);
        
        for (int r =0; r<board.length; r++)
        for(int c =0; c<board[r].length; r++){
            System.out.print(board[r][c]);
        }

    }

}
