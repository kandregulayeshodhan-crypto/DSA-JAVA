class Solution {
    public boolean possibleDivisor(int mid, int[] nums, int threshold) {
        long sum=0;
        for(int i=0;i<nums.length;i++) {
            sum+=((long)nums[i]+mid-1)/mid;
        }
        return sum<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            max=Math.max(max,nums[i]);
        }
        int low=1;
        int high=max;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(possibleDivisor(mid,nums,threshold)) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
}