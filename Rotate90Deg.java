// 2 – Given a 2D array(n x m). Rotate the array 90 degrees clockwise
// I/P
// mat = [ [1, 2, 3],
// [4, 5, 6],
// [7, 8, 9]]

// O/P
// Ans = [ [7, 4, 1],
// [8, 5, 2],
// [9, 6, 3]]
public class Rotate90Deg {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] res = new int[mat.length][mat[0].length];
        int r=0;
        //Logic to get the Rotatae 90 degree matrix
        for(int col = 0; col < mat[0].length; col++){
            int c = 0;
            for(int row = mat.length-1; row >=0; row--){
                res[r][c] = mat[row][col];
                c++;
            }
            r++;
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){

                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
