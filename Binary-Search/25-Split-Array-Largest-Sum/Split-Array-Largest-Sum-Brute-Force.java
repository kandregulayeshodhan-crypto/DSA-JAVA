class Solution {
    public boolean canSplit(int[] nums, int k, int limit) {
        int groups = 1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= limit) {
                sum += nums[i];
            } else {
                groups++;
                sum = nums[i];
            }
        }

        return groups <= k;
    }

    public int splitArray(int[] nums, int k) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }

        for (int limit = max; limit <= sum; limit++) {
            if (canSplit(nums, k, limit)) {
                return limit;
            }
        }

        return -1;
    }
}
