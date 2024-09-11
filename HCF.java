public class HCF {
 public static void main(String[] args) {
    System.out.println(hcf(12, 24));
 }  
 public static int hcf(int a, int b){
    if(b == 0){
        return a;
    }
    return hcf(b, a%b);
 } 
}
