public class MatrixOp {
public static int diagonalOp(int[][] matA, int[][] matB){
    int sum=0;
    int[] matA_diagonals = new int[matA.length];
    int[] matB_diagonals = new int[matB.length];

    for(int r=0; r<matA.length; r++) {
        matA[r][r] = matA_diags[r];
}
for(int r=0; r<matB.length; r++) {
    matB[r][r] = matB_diags[r];
}

for (int i=0; i<matA_diagonals.length; i++ ){
    sum+=(matA_diagonals[i]*matB_diagonals[i]);
}
    System.out.println("The sum is: " + sum);
}

public static int[][] expandMatrix(int[][] matA){
    
}

}
