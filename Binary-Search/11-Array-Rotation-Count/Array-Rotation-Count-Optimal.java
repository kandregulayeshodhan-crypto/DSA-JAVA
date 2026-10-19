class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int low=0;
        int high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high) {
            if(arr[low]<=arr[high]) {
                if(arr[low]<ans) {
                    index=low;
                    ans=arr[low];
                }
                break;
            } 
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]) {
                if(arr[low]<ans) {
                    index=low;
                    ans=arr[low];
                }
                low=mid+1;
            }
            else {
                if(arr[mid]<ans) {
                    index=mid;
                    ans=arr[mid];
                }
                high=mid-1;
            }
        }
        return index;
    }
}
