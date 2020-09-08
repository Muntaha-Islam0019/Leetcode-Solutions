import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] newArr = twoSum(arr, 9);
        System.out.println(Arrays.toString(newArr));
    }

    private static int[] twoSum(int[] nums, int target) {

        int x = 0, y = 0;

        loop:
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target) {
                    x = i;
                    y = j;
                    break loop;
                }
            }
        }

        return new int[]{x, y};
    }
}