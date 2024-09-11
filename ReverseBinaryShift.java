import java.util.Scanner;


public class ReverseBinaryShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int shift=0; shift<10; shift++) {
            if((n & (1 << shift)) != 0){
                System.out.print('1');
            }else{
                System.out.print('0');
            }
        }
        sc.close();
    }
}
