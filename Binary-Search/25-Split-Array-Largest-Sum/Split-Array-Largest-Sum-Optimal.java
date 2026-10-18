class Solution {
	public boolean canSplit(int[] arr, int k, long limit) {
		int subArrays = 1;
		long currentSum = 0;
		for (int i = 0; i<arr.length; i++) {
			if (currentSum + arr[i] <= limit) {
				currentSum += arr[i];
			}
			else {
				subArrays++;
				currentSum = arr[i];
			}
		}
		return subArrays <= k;
	}
	public int splitArray(int[] arr, int k) {
		// code here
		long low = 0;
		long high = 0;
		for (int i = 0; i<arr.length; i++) {
			low = Math.max(low, arr[i]);
			high += arr[i];
		}
		while (low <= high) {
			long mid = low + (high - low)/2;
			if (canSplit(arr, k, mid)) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return (int)low;
	}
}
