import java.util.*;

public class RottenOranges {
    public int orangesRotting(int[][] grid) {
        // 0 - empty   1 - fresh   2 - rotten
        int Row = grid.length;
        int Col = grid[0].length;
        Queue<cell> queue = new LinkedList<>();

        int freshCount = 0;
        int minutesTaken = 0;
        System.out.print(Row + " " + Col);
        for(int i=0; i < Row; i++) {
            for(int j = 0; j < Col; j++) {
                if(grid[i][j] == 2) { //Rotten 
                    cell c = new cell(i, j, 0);
                    queue.add(c);
                }
                else if(grid[i][j] == 1) { 
                    freshCount++;
                }
            }
        }

        if( freshCount == 0){
            return 0;
        }

        int[][] dir = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
        while( !queue.isEmpty() ) {
            cell curr = queue.poll();
            minutesTaken = Math.max(minutesTaken, curr.mins);
            for(int i=0; i<dir.length; i++ ) {
                int nxtRow = curr.row + dir[i][0];
                int nxtCol = curr.col + dir[i][1];
                if(isFresh(grid, nxtRow, nxtCol, Row, Col)){
                    queue.add(new cell(nxtRow, nxtCol, curr.mins + 1));
                    freshCount--;
                    grid[nxtRow][nxtCol] = 2; //Making it rotten since it become rotten
                }
            }
        }

        if(freshCount > 0){
            return -1;
        }else{
            return minutesTaken;
        }
    }

    public boolean isFresh(int[][] grid,int row, int col, int Row, int Col) {
        return row >= 0 && col >= 0 && row < Row && col < Col && grid[row][col] == 1;
    }
}

class cell{
    int row;
    int col;
    int mins;
    cell(int row, int col, int mins) {
        this.row = row;
        this.col = col;
        this.mins = mins;
    }
}
