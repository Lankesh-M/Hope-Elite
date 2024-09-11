import java.util.Scanner;

public class LongestSubsequenceInTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        //Expected output : ne - 2

        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for(int i=0; i < dp.length; i++){ // str1
            for(int j=0; j < dp[0].length; j++){ //str2
                if( i == 0 || j == 0){
                    dp[i][j] = 0; // You can also skip this line
                }else{
                    if(str1.charAt(i-1) == str2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1] + 1; //Adding 1 to the left diagonal position
                    }else{
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]); //Storing the max value for top and left position
                    }
                }
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(dp[str1.length()][str2.length()]);
    }
}
