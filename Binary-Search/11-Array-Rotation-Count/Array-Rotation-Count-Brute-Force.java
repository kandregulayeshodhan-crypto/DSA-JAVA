class Solution {
    public int findKRotation(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        return index;
    }
}
