import java.util.*;

class Cell {
    int row;
    int col;
    int street; // To count the number of streets (steps) taken to reach this cell

    Cell(int row, int col, int street) {
        this.row = row;
        this.col = col;
        this.street = street;
    }
}

class BFS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] matrix = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean[][] visited = new boolean[R][C]; // Initially set to false
        int startRow = sc.nextInt(); 
        int startCol = sc.nextInt(); 
        int endRow = sc.nextInt();
        int endCol = sc.nextInt(); 

        Queue<Cell> queue = new LinkedList<>();
        queue.add(new Cell(startRow, startCol, 0));

        // Directions for moving Left, Right, Up, Down
        int[] rowDirections = {0, 0, -1, 1}; // Left, Right, Up, Down row changes
        int[] colDirections = {-1, 1, 0, 0}; // Left, Right, Up, Down column changes

        while (!queue.isEmpty()) {
            Cell curr = queue.poll();
            // If the end position is reached, print the number of streets and exit
            if (curr.row == endRow && curr.col == endCol) {
                System.out.println("Minimum streets required: " + curr.street);
                return;
            }

            // Check if already visited
            if (visited[curr.row][curr.col]) {
                continue;
            }

            // Mark the cell as visited
            visited[curr.row][curr.col] = true;

            // Explore all four directions: Left, Right, Up, Down
            for (int dir = 0; dir < 4; dir++) {
                int newRow = curr.row;
                int newCol = curr.col;

                // Keep moving in the current direction until hitting a block or boundary
                while (true) {
                    newRow += rowDirections[dir];
                    newCol += colDirections[dir];

                    // Check boundaries, blocks, and visited status
                    if (newRow < 0 || newRow >= R || newCol < 0 || newCol >= C ||
                        matrix[newRow][newCol] == 0 || visited[newRow][newCol]) {
                        break;
                    }

                    // Add the new cell with an incremented street count
                    queue.add(new Cell(newRow, newCol, curr.street + 1));
                }
            }
        }

        // If the end position is not reached
        System.out.println("End position not reachable from the start position.");
        sc.close();
    }
}
