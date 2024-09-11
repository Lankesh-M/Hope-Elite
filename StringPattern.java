
public class StringPattern {
    public static void main(String[] args) {
        boolean res = check("abbacbaa", "ab.a");
        System.out.println(res);
    }

    public static boolean check(String str, String pattern){
        boolean res = true;
        int lStr = 0;
        int rStr = str.length() - 1;
        int lPat = 0;
        int rPat = pattern.length() - 1;
        boolean lFlag = true;
        boolean rFlag = true;

        while (lStr <= rStr && lPat <= rPat) {
            if((str.charAt(lStr) == pattern.charAt(lPat) || pattern.charAt(lPat) == '.') && lFlag){
                lStr++;
            }
            if((str.charAt(rStr) == pattern.charAt(rPat) || pattern.charAt(rPat) == '.') && rFlag){
                rStr--;
            }
            if(pattern.charAt(lPat) == '*'){
                lFlag = false;
            }
            if(pattern.charAt(rPat) == '*'){
                rFlag = false;
            }
            lPat++;
            rPat--;
        }
        System.out.println(lStr + " " + lPat);
        System.out.println(rStr + " " + rPat);
        return res;
    }
}
