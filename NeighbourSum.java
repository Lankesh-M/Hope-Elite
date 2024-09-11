import java.util.Scanner;

public class NeighbourSum {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int[][] mat = new int[row][col];
    for(int i=0; i<row; i++) {
         for(int j = 0; j < col; j++) {
            mat[i][j] =  sc.nextInt();
         }
    }

    //Modified Matirx
    for(int i=0; i < row; i++) {
        int neighSum = 0;
        for(int j = 0; j< col; j++) {
            //Top Left
            if(isValid(i-1, j-1, row, col)){
                neighSum += mat[i-1][j-1];
            }
            //Top middle
            if(isValid(i-1, j, row, col)){
                neighSum += mat[i-1][j];
            }
            //Top right
            if(isValid(i-1, j+1, row, col)){
                neighSum += mat[i-1][j+1];
            }
            //Left
            if(isValid(i, j-1, row, col)){
                neighSum += mat[i][j-1];
            }
            //Right
            if(isValid(i, j+1, row, col)){
                neighSum += mat[i][j+1];
            }
            //Bottom Left
            if(isValid(i+1, j-1, row, col)){
                neighSum += mat[i+1][j-1];
            }
            //Bottom middle
            if(isValid(i+1, j, row, col)){
                neighSum += mat[i+1][j];
            }
            //Bottom Right
            if(isValid(i+1, j+1, row, col)){
                neighSum += mat[i+1][j+1];
            }
            System.out.print(neighSum + " ");
            neighSum = 0;
        }
        System.out.println();
        sc.close();
    }


 }
 
 public static boolean isValid(int r, int c, int row, int col){
    return ! (r < 0 || c < 0 || r >= row || c >= col);
        
    

 }
}
