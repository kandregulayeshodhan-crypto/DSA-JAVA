class Solution {
    public boolean canShip(int capacity, int[] weights, int days) {
        int daysCount=1;
        int load=0;
        for(int i=0;i<weights.length;i++) {
            if(load+weights[i]<=capacity) {
            load+=weights[i];
            }
            else {
                daysCount++;
                load=weights[i];
            }
        }
        return daysCount<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<weights.length;i++) {
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int low=max;
        int high=sum;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(canShip(mid,weights,days)) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
}