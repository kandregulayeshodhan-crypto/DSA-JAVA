class Solution {
    public int findMin(int[] arr) {
        // code here
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<smallest) {
                smallest=arr[i];
            }
        }
        return smallest;
    }
}