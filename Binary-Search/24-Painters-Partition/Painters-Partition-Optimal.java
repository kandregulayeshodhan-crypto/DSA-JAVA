class Solution {
    public boolean canPaint(int[] arr,int k,long limit) {
        int painters=1;
        long currentTime=0;
        for(int i=0;i<arr.length;i++) {
            if(currentTime+arr[i]<=limit) {
                currentTime+=arr[i];
            }
            else {
                painters++;
                currentTime=arr[i];
            }
        }
        return painters<=k;
    }
    public int minTime(int[] arr, int k) {
        // code here
        long low=0;
        long high=0;
        for(int i=0;i<arr.length;i++) {
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        while(low<=high) {
            long mid=low + (high-low)/2;
            if(canPaint(arr,k,mid)) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return (int)low;
    }
}
