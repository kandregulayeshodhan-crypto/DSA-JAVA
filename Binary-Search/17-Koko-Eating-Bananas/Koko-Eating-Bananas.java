class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=piles[0];
        for(int i=0;i<piles.length;i++) {
            maxi=Math.max(maxi,piles[i]);
        }
        int low=1;
        int high=maxi;
        while(low<=high) {
            int mid=low+(high-low)/2;
            long hours=0;
            for(int i=0;i<piles.length;i++) {
                hours+=(piles[i]+(long)mid-1)/mid;
            }
            if(hours<=h) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
}