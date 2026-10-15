class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==target) {
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<target) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        if(first==-1) {
            return 0;
        }
        low=0;
        high=arr.length-1;
        int last=-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==target) {
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<target) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return last-first+1;
    }
}
