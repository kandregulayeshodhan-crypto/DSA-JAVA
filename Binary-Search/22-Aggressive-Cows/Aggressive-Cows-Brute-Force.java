import java.util.Arrays;

class Solution {
    boolean canPlaceCows(int[] stalls, int k, int distance) {
        int cows = 1;
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= distance) {
                cows++;
                lastPosition = stalls[i];
            }

            if (cows == k) {
                return true;
            }
        }

        return false;
    }

    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);

        int n = stalls.length;
        int maxDistance = stalls[n - 1] - stalls[0];

        for (int distance = maxDistance; distance >= 0; distance--) {
            if (canPlaceCows(stalls, k, distance)) {
                return distance;
            }
        }

        return 0;
    }
}
