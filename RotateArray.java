public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int rotate = 2;
        //To reverse the array
        arr = reverse(arr);
        int splitPos = arr.length - rotate;
        System.out.println(splitPos);
        int[] split1 = new int[splitPos];
        int[] split2 = new int[arr.length - splitPos];

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        for(int i = 0; i < splitPos; i++){
            split1[i] = arr[i];
            // System.out.print(split1[i] + " ");
        }
        split1 = reverse(split1);
        
        for(int i = 0; i < arr.length - splitPos; i++){
            split2[i] = arr[i+splitPos];
            // System.out.print(split2[i] + " ");
        }
        split2 = reverse(split2);
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(i < split1.length){
                res[i] = split1[i];
            }else{
                res[i] = split2[i - splitPos];
            }
            System.out.print(res[i] + " ");
        }
        

    }
    public static int[] reverse(int[] arr){
        int l = 0;
        int r = arr.length - 1;
        while( l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }
}
