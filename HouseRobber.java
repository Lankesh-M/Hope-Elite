public class HouseRobber {
    public static void main(String[] args) {
        int[] house = {10, 5, 100, 200};
        int m1 = Math.max(house[0], house[1]);
        int m2 = m1;
        int[] max = new int[house.length];
        max[0] = m1;
        max[1] = m2;
        System.out.println(houseRobber(house, max));
    }

    

    public static int houseRobber(int[] houses, int[] max){
        for(int i=2; i<houses.length; i++) {
            if(houses[i-1]%2 == houses[i]%2){
                max[i] = Math.max(houses[i]+max[i-1], houses[i]+max[i-2]);
            }else{
                max[i] = Math.max(houses[i]+max[i-2], max[i-1]);
            }
        }
        return max[max.length - 1];
    }
}
