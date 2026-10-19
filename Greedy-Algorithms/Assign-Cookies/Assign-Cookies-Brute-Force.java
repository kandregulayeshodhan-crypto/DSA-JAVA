class Solution {
    public int findContentChildren(int[] g, int[] s) {

        boolean[] used = new boolean[s.length];
        int count = 0;

        for (int i = 0; i < g.length; i++) {

            for (int j = 0; j < s.length; j++) {

                if (!used[j] && s[j] >= g[i]) {
                    used[j] = true;
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}