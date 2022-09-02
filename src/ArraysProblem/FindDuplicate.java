package ArraysProblem;

/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
  There is only one repeated number in nums, return this repeated number.*/

public class FindDuplicate {

    public static void main(String[] args) {

        int[] a = new int[] {5,1,2,3,5,4};

        int ans = findDuplicate(a);

        System.out.println(ans);

    }

    public static int findDuplicate(int[] nums) {

        int ans = -1;

        for(int i=0; i<nums.length; i++){

            int index = Math.abs(nums[i]);

            if(nums[index-1]<0){
                ans = Math.abs(nums[i]);
                break;
            }
            else{
                nums[index-1] = -(nums[index-1]);
            }
        }

        return ans;
    }
}
