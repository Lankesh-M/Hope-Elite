public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 15, 5, 25, 5, 20, 5, 5, 10, 10};
        int target = 30;
        int i = 0;
        int sum = arr[0];
        int counter = 0;
        for(int j=1; j<arr.length ; j++) {
            sum += arr[j];
            if(sum > target){
                while(sum > target && i < j){
                    sum -= arr[i];
                    i++;
                }
            }
            if(sum == target){
                counter++;
                sum -= arr[i];
                i++;
            }
        }
        System.out.println(counter);
    }
}
