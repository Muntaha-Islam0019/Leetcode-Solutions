import java.util.Arrays;

class P53 {
    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int current_sum = 0;
        int[] copy = new int[nums.length];
        copy = Arrays.copyOf(nums, nums.length);

        // System.out.println(nums == copy);

        Arrays.sort(copy);
        if (copy[copy.length - 1] <= 0) {
            return copy[copy.length - 1];
        }

        for (int num : nums) {
            current_sum += num;
            if (current_sum < 0) {
                current_sum = 0;
            } else if (current_sum > result) {
                result = current_sum;
            }
        }

        return result;
    }

    // public static void main(String[] args) {
    //     System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    // }
}