public class pencil {
    public static void main(String[] args) {
        String str = "pencil";
        StringBuilder res = new StringBuilder();
        int n = 14;
        int extra = n%str.length();
        int perfect = n/str.length();
        // System.out.println(extra);
        for(int i=0; i<perfect; i++){
            res.append(str);
        }
        int i=0;
        while(extra-- > 0){
            res.append(str.charAt(i++));
        }
        System.out.println(res);

    }   
}
