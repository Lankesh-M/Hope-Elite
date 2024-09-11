import java.util.HashMap;

public class Equals1_0 {
    public static void main(String[] args) {
        // String str = "110011100100";
        String str = "1111111001010000";
        // 11100100 4 0's and 1's Therefore the ans will 8
        int val = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '1')
                val += 1;
            else
                val -= 1;
            if(map.containsKey(val)){
                int curLen = i - map.get(val);
                maxLen = Math.max(curLen, maxLen);
            }else{
                map.put(val, i);
            }
        }
        System.out.println(maxLen);
    }
}
