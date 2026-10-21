class Solution {

    // Find the first index where arr[index] >= target
    int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public int rowWithMax1s(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int maxOnes = 0;
        int rowIndex = -1;

        for (int i = 0; i < rows; i++) {
            int firstOne = lowerBound(mat[i], 1);
            int count = cols - firstOne;

            if (count > maxOnes) {
                maxOnes = count;
                rowIndex = i;
            }
        }

        return rowIndex;
    }
}
