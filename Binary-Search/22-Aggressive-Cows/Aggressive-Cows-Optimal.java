import java.util.Arrays;
class Solution {
	public boolean canPlaceCows(int[] arr, int k, int distance) {
		int cows = 1;
		int lastPosition = arr[0];
		for (int i = 1; i<arr.length; i++) {
			if (arr[i]-lastPosition >= distance) {
				cows++;
				lastPosition = arr[i];
			}
			if (cows == k) {
				return true;
			}
		}
		return false;
	}
	public int aggressiveCows(int[] arr, int k) {
		// code here
		Arrays.sort(arr);
		int n = arr.length;
		int low = 1;
		int high = arr[n - 1]-arr[0];
		while (low <= high) {
			int mid = low + (high - low)/2;
			if (canPlaceCows(arr, k, mid)) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return high;
	}
}
