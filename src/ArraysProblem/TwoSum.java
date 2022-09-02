package ArraysProblem;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[]ans1 = new int[2];
        int[]ans2 = new int[2];

        ans1 = twoSum(new int[]{2,7,11,15},9);
        ans2 = twoSum(new int[]{3,2,4},6);

        for(int i=0; i<2; i++){
            System.out.print(ans1[i] + " ");
        }
        System.out.println(" ");
        for(int i=0; i<2; i++){
            System.out.print(ans2[i] + " ");
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0],0);

        int[] ans = new int[2];

        for(int i=1; i<nums.length; i++){
            int diff = target-nums[i];

            if(map.containsKey(diff)){
                ans[0]= map.get(diff);
                ans[1]=i;
                break;
            }
            else
                map.put(nums[i],i);

        }

        return ans;
    }
}
