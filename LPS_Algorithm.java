public class LPS_Algorithm {
    public static void main(String[] args) {
        String s = "Manager";
        String key = "age";
        int[] lps = new int[s.length()];
        int streakInd = 0;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == key.charAt(streakInd)) {
                lps[i] = streakInd+1;
                // i++;
                streakInd++;
            }else{
                lps[i] = 0;
                streakInd = 0;
            }
            // System.out.print(lps[i] + " ");
        }

        for(int i = 0; i < s.length(); i++) {
            System.out.print(lps[i] + " ");
        }
    }
}
