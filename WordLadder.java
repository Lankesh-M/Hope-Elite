import java.util.HashMap;

public class WordLadder {
    public static void main(String[] args) {
        String[] arr = {"item", "monkey", "gomathi", "elephant", "tiger", "ring", "young"};

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i < arr.length; i++) {
            map.put(arr[i].charAt(0), i);
        }

        System.out.println("elephant");
        char lastLetter = 't';
        while(map.containsKey(lastLetter)){
            System.out.println(arr[map.get(lastLetter)]);
            lastLetter = (arr[map.get(lastLetter)]).charAt(arr[map.get(lastLetter)].length() - 1);
        }
    }   
}
