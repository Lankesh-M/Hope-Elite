public class LongestIncreasingSubsequences {
    public static void main(String[] args) {
        int[] nums = {-7, 1,3,2,4,10,9,8,11,5};
        int[] maxSeq =  new int[nums.length];
        for(int i=0; i<maxSeq.length; i++) {
            maxSeq[i] = 1;
        }

        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[j] < nums[i]){
                    maxSeq[i] = maxSeq[j] + 1;
                }
            }
        }
        int maxLen = maxSeq[0];
        for(int i=1; i<maxSeq.length; i++) {
            if(maxSeq[i] > maxLen) maxLen = maxSeq[i];
            System.out.print(maxSeq[i] + " ");
        }
        System.out.print("\n" + maxLen);

    }
}
