class Solution {
    public boolean canPaint(int[] arr, int k, int limit) {
        int painters = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= limit) {
                sum += arr[i];
            } else {
                painters++;
                sum = arr[i];
            }
        }

        return painters <= k;
    }

    public int minTime(int[] arr, int k) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }

        for (int limit = max; limit <= sum; limit++) {
            if (canPaint(arr, k, limit)) {
                return limit;
            }
        }

        return -1;
    }
}
