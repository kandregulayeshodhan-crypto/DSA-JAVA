class Solution {
    public boolean check(int[] nums) {

        int n = nums.length;

        for (int start = 0; start < n; start++) {

            boolean sorted = true;

            for (int j = 0; j < n - 1; j++) {

                int current = nums[(start + j) % n];
                int next = nums[(start + j + 1) % n];

                if (current > next) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                return true;
            }
        }

        return false;
    }
}
