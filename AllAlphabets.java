//Using shift wise operator
import java.util.Scanner;
public class AllAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alpha = sc.nextLine();
        int res = 0;
        for(int ind = 0; ind<alpha.length(); ind++){
            res = res | (1 << (alpha.charAt(ind) - 'a'));
        }
        System.out.println(res == (1<<26) - 1 ? "Yes" : "No");
        System.out.println(res);

        //Print the binary
        for(int shift=0; shift<26; shift++){
            if( (res & (1 << shift)) != 0){
                System.out.print('1');
            }else{
                System.err.print( '0');
            }
        }
        sc.close();
    }
}
