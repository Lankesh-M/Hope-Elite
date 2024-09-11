public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {50, -100, 20, 30, -100, 50, 60, 100, -200};

        int currSum = arr[0];
        int maxSum = arr[0];
        for(int i=1; i<arr.length; i++) {
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }
}
