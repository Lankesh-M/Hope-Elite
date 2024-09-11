public class CollidedString {
    public static void main(String[] args) {
        String s1 = "NOSE", s2 = "NECK", s = "NONSEECK";
        if(checkValidString(s1, s2, s, 0, 0, 0)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    public static boolean checkValidString(String firstString, String secondString, String checkString, int firstIndex, int secondIndex, int checkIndex) {
        if(checkIndex == checkString.length()) {
            return true;
        }
        
        char checkChar = checkString.charAt(checkIndex);
        boolean checkFirstString = false, checkSecondString = false;
        if(firstIndex < firstString.length() && firstString.charAt(firstIndex) == checkChar) {
            checkFirstString = checkValidString(firstString, secondString, checkString, firstIndex + 1, secondIndex, checkIndex + 1);
        }
        if(secondIndex < secondString.length() && secondString.charAt(secondIndex) == checkChar) {
            checkSecondString = checkValidString(firstString, secondString, checkString, firstIndex , secondIndex + 1, checkIndex + 1);
        }
        return checkFirstString || checkSecondString;
    }
}

// public class CollidedString {
//     public static void main(String[] args) {
//         System.out.println(check("NOSE", "NECk", "NONSEECK", 0, 0, 0) );
//     }

//     public static boolean check(String str1, String str2, String mix, int ind1, int ind2, int ind3){
//         if(ind1 < str1.length() && ind3 < mix.length() && str1.charAt(ind1) == mix.charAt(ind3)){
//             ind1++;
//             ind3++;
//             while(ind1 < str1.length() && ind3 < mix.length() && str1.charAt(ind1) == mix.charAt(ind3)){
//                 ind1++;
//                 ind3++;
//             }
//         }
//         else if(ind2 < str2.length() && ind3 < mix.length() && str2.charAt(ind2) == mix.charAt(ind3)){
//             ind2++;
//             ind3++;
//             while(ind2 < str2.length() && ind3 < mix.length() && str2.charAt(ind2) == mix.charAt(ind3)){
//                 ind2++;
//                 ind3++;
//             }
//         }
//         else{
//             return false;
//         }
//         System.out.println(ind1 + " " + ind2 + " "+ ind3);
//         check(str1, str2, mix, ind1, ind2, ind3);
//         // System.out.println(ind3);
//         return (ind1 + ind2) == ind3;
//     }
// }