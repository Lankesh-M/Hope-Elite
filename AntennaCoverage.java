import java.util.*;
public class AntennaCoverage {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
		    nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
// 		k = 4;
        int covStart = 0;
		int antennaPos = 0;
		int antennaCount = 1;
		for(int i=1; i<n; i++) {
		    if(nums[covStart] >= nums[i] - k){
		        antennaPos = i;
		    }else if(nums[i]-k <= nums[antennaPos]){
		        //continue;
		    }else{
		        covStart = i;
		        antennaCount++;
		        antennaPos = i;
		    }
		}
		System.out.print(antennaCount);

	}
}