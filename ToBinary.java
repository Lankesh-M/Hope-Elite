public class ToBinary {
    public static void main(String[] args) {
        StringBuilder output = toBinary(11);
        System.out.println(output);

        toBinaryRec(11);
    }

    public static StringBuilder toBinary(int n){
        StringBuilder res = new StringBuilder();
        while(n >= 1){
            if(n%2 == 0){
                res = res.append('0');
            }else{
                res = res.append('1');
            }

            n /= 2;
        }
        res.reverse();
        return res;
    }

    public static void toBinaryRec(int n){
        if(n == 0){
            return;
        }
        toBinaryRec(n/2);
        System.out.print(n%2);
    }


}
