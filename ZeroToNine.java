import java.util.Scanner;

public class ZeroToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while(n > 0){
            res = res | (1 << n%10);
            n/=10;
        }
        System.out.println(res == (1 << 10) - 1 ? "Yes" : "No");
        sc.close();
    }
}
