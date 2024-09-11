// 5 – Decrypting the given string. The string will contain lowercase English characters, positive integers, [lowercase
// English alphabets enclosed by square brackets( “[ ]”). All the square brackets will have a positive integer before
// them. And the characters inside the “[ ]” should be printed n times continuously in the output.( Eg. If the string is
// n[abc] then the output should be abcabcabc.... (n times))
// I/P
// string = “abc2[abcd2[efg]1[ab]]abcd”
// O/P
// ans = “abcabcdefgefgababcdefgefgababcd”

import java.util.Stack;
public class DecryptString{
    public static void main(String args[]){
        System.out.println("Hello World");
        String modString = soln("abc2[ef3[o]]c");
        System.out.println(modString);
    }
    public static String soln(String str){
        StringBuilder resStr= new StringBuilder();
        Stack<String> curStr = new Stack<>();
        Stack<Integer> curNum = new Stack<>();
        int num = 0;

        for(char c : str.toCharArray()){
            if(Character.isDigit(c) ){
                num = num*10+c-'0';
            }
            else if(c == '['){
                curStr.push(resStr.toString());
                curNum.push(num);
                resStr = new StringBuilder();
                num = 0;

            }else if(c == ']'){
                String lastString = curStr.pop();
                int lastNum = curNum.pop();
                StringBuilder append = new StringBuilder();
                for(int i=0; i<lastNum; i++){
                    append.append(resStr);
                }
                resStr = new StringBuilder(lastString + append);
            }else{
                resStr.append(c);
            }
        }
        return resStr.toString();
    }

}