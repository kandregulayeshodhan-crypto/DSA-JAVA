class Solution {
    public int getSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;

        // First traversal: Find largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;

        // Second traversal: Find second largest
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }
}
