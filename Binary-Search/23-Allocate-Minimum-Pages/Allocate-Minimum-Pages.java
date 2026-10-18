class Solution {
    public boolean canAllocate(int[] arr,int k,long limit) {
        int students=1;
        long pages=0;
        for(int i=0;i<arr.length;i++) {
            if(pages+arr[i]<=limit) {
                pages+=arr[i];
            }
            else {
                students++;
                pages=arr[i];
            }
        }
        return students<=k;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length) {
            return -1;
        }
        long low=0;
        long high=0;
        for(int i=0;i<arr.length;i++) {
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        while(low<=high) {
            long mid=low+(high-low)/2;
            if(canAllocate(arr,k,mid)) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return (int)low;
    }
}