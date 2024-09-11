// 3 – Consider that there is a sorted array (in non – descending order) of length n. And then it gets rotated n(1 <= n
// <= length of the array ) times. Now you have to find the smallest element in the array. (Rotated => removing the 1st
// element and adding it to the last of the array)

// Your algorithm must run in O(log N) time complexity.
// I/P
// arr = [ 3, 4, 7, 9, 1, 2]

public class FindSmall {
    public static void main(String[] args) {
        int[] arr = {3,4,5,7,9,0,2};
        System.out.println(smallest(arr));
    }

    public static int smallest(int[] arr){
        int l = 0;
        int r = arr.length - 1;
        while(arr[l] > arr[r-1]){
            l++;
            r--;
        }
        return Math.min(arr[l], arr[r]);
    }
}
