// public class CollidedString {
//     public static void main(String[] args) {
//         System.out.println(check("NOSE", "NECk", "NONSEECK", 0, 0, 0) );
//     }

    
//     public static boolean check(String str1, String str2, String mix, int ind1, int ind2, int ind3) {
//         // Base case: If all indices are at the end of their respective strings
//         if (ind1 == str1.length() && ind2 == str2.length() && ind3 == mix.length()) {
//             return true;
//         }

//         // If ind3 has reached the end of mix but ind1 or ind2 haven't reached the end
//         if (ind3 == mix.length()) {
//             return false;
//         }

//         // Check if the current character of mix matches the current character of str1
//         if (ind1 < str1.length() && str1.charAt(ind1) == mix.charAt(ind3)) {
//             // Recursively check by advancing in str1 and mix
//             if (check(str1, str2, mix, ind1 + 1, ind2, ind3 + 1)) {
//                 return true;
//             }
//         }

//         // Check if the current character of mix matches the current character of str2
//         if (ind2 < str2.length() && str2.charAt(ind2) == mix.charAt(ind3)) {
//             // Recursively check by advancing in str2 and mix
//             if (check(str1, str2, mix, ind1, ind2 + 1, ind3 + 1)) {
//                 return true;
//             }
//         }

//         // If neither of the above conditions match, return false
//         return false;
//     }
// }



// public class CollidedString {
//     public static void main(String[] args) {
//         String s1 = "NOSE", s2 = "NECK", s = "NONSEECK";
//         if(checkValidString(s1, s2, s, 0, 0, 0)) {
//             System.out.println("Valid");
//         } else {
//             System.out.println("Invalid");
//         }
//     }
//     public static boolean checkValidString(String firstString, String secondString, String checkString, int firstIndex, int secondIndex, int checkIndex) {
//         if(checkIndex == checkString.length()) {
//             return true;
//         }
        
//         char checkChar = checkString.charAt(checkIndex);
//         boolean checkFirstString = false, checkSecondString = false;
//         if(firstIndex < firstString.length() && firstString.charAt(firstIndex) == checkChar) {
//             checkFirstString = checkValidString(firstString, secondString, checkString, firstIndex + 1, secondIndex, checkIndex + 1);
//         }
//         if(secondIndex < secondString.length() && secondString.charAt(secondIndex) == checkChar) {
//             checkSecondString = checkValidString(firstString, secondString, checkString, firstIndex , secondIndex + 1, checkIndex + 1);
//         }
//         return checkFirstString || checkSecondString;
//     }
// }

public class CollidedString {
    public static void main(String[] args) {
        System.out.println(check("NOSE", "NECk", "NONSEECK", 0, 0, 0) );
    }

    public static boolean check(String str1, String str2, String mix, int ind1, int ind2, int ind3){
        if(ind1 < str1.length() && ind3 < mix.length() && str1.charAt(ind1) == mix.charAt(ind3)){
            ind1++;
            ind3++;
            while(ind1 < str1.length() && ind3 < mix.length() && str1.charAt(ind1) == mix.charAt(ind3)){
                ind1++;
                ind3++;
            }
        }
        else if(ind2 < str2.length() && ind3 < mix.length() && str2.charAt(ind2) == mix.charAt(ind3)){
            ind2++;
            ind3++;
            while(ind2 < str2.length() && ind3 < mix.length() && str2.charAt(ind2) == mix.charAt(ind3)){
                ind2++;
                ind3++;
            }
        }
        else{
            return false;
        }
        System.out.println(ind1 + " " + ind2 + " "+ ind3);
        check(str1, str2, mix, ind1, ind2, ind3);
        // System.out.println(ind3);
        return (ind1 + ind2) == ind3;
    }
}