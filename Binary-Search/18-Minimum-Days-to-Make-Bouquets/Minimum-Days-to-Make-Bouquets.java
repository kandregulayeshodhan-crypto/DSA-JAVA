class Solution {
    public boolean canPossible(int mid,int[] bloomDay, int m, int k) {
        int flowers=0;
        int bouquets=0;
        for(int i=0;i<bloomDay.length;i++) {
            if(bloomDay[i]<=mid) {
                flowers++;
                if(flowers==k) {
                    bouquets++;
                    flowers=0;
                }
            } 
            else {
                flowers=0;
            }
        }
        return bouquets>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) {
            return -1;
        }
        int minDay=Integer.MAX_VALUE;
        int maxDay=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++) {
            minDay=Math.min(minDay,bloomDay[i]);
            maxDay=Math.max(maxDay,bloomDay[i]);
        }
        int low=minDay;
        int high=maxDay;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(canPossible(mid,bloomDay,m,k)) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
}