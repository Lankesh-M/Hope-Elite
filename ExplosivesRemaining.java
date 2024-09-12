import java.util.*;
public class ExplosivesRemaining {
    static int explosiveCount = 0; 
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		char[][] places = new char[row][col];
		
// 		int explosiveCount = 0;
		for(int i = 0; i < row; i++) {
		    for(int j = 0; j <  col; j++){
		        places[i][j] = sc.next().charAt(0);
		        if(places[i][j] == 'E'){
		            explosiveCount++;
		        }
		    }
		}
		int noOfExplosives = sc.nextInt();
		int[][] explosivesPos = new int[noOfExplosives][2];
		for(int i = 0; i < noOfExplosives; i++){
		    explosivesPos[i][0] = sc.nextInt();
		    explosivesPos[i][1] = sc.nextInt();
		}
		
		for(int i=0; i < noOfExplosives; i++){
		    int nRow = explosivesPos[i][0];
		    int nCol = explosivesPos[i][1];
		    dfs(places, nRow, nCol, row, col);
		}
		
		System.out.print(explosiveCount);
		
		
	}
	
    public static void dfs(char[][] places, int nRow, int nCol, int row, int col){
        
        if(places[nRow][nCol] != 'E') return;
        places[nRow][nCol] = 'X';
        explosiveCount--;
        
        int[][] dir = {{-1,-1}, {-1,0}, {-1,1}, {0,-1}, {0, 1}, {1,-1}, {1,0}, {1,1}};
        
        for(int i=0; i<dir.length; i++) {
            int nxtRow = nRow + dir[i][0];
            int nxtCol = nCol + dir[i][1];
            if(isValid(nxtRow, nxtCol, row, col)){
            dfs(places, nxtRow, nxtCol, row, col);
            }
        }
    }	
	
	public static boolean isValid(int nRow, int nCol, int row, int col){
	    if(nRow < 0 || nCol < 0 || nRow >= row || nCol >= col){
	        return false;
	    }
	    return true;
	}
}