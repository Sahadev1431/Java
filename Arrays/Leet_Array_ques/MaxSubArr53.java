public class MaxSubArr53 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0 ) {
                sum = 0;
            }
        }
        if (max < 0) {
            max = 0;
        }
        return max;
    }
}
