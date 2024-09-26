import java.util.*;

public class crossWordPuzzle {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();
    int c = sc.nextInt();

    char[][] puzzle = new char[r][c];

    for(int i = 0; i < r; i++) {
        for(int j = 0; j < c; j++) {
            puzzle[i][j] = sc.next().charAt(j);
        }
        System.out.println();
    }
 }   
}
