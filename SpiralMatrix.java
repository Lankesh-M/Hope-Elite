import java.util.ArrayList;
import java.util.List;
// 1 – You will be provided with a 2D array(n x m). You have to generate a 1D array of elements from the given matrix
// in spiral order.
// I/P
// mat = [ [1, 2, 3],
// [4, 5, 6],
// [7, 8, 9]]
// O/P
// Ans = [1, 2, 3, 6, 9, 8, 7, 4, 5]
public class SpiralMatrix {
    public static void main(String[] args) {
        
        int[][] matrix =  {{1,2,3},{5,6,7},{9,10,11},{12,13,14}};
        List<Integer> res = new ArrayList<>();
        res = spiral(matrix, res);
        System.out.println(res);
    }
    public static List<Integer> spiral(int[][] mat,List<Integer> res){
        int row = mat.length;
        int col = mat[0].length;
        int left = 0, top = 0;
        int right = col-1, bottom = row-1;

        while(left <= right && top <= bottom){
            // ----->
            for(int i=left; i<=right; i++){
                res.add(mat[top][i]);
            }
            top++;

            // Down
            for(int i=top; i<=bottom; i++){
                res.add(mat[i][right]);
            }
            right--;
            // <------
            for(int i=right; i>=left; i--){
                res.add(mat[bottom][i]);
            }
            bottom--;
            
            //Up
            for(int i=bottom; i>=top; i--){
                res.add(mat[i][left]);
            }
            left++;
        }

        return res;
    }
}
