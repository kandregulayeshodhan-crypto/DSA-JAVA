class Solution {
    public int rowWithMax1s(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int maxOnes = 0;
        int rowIndex = -1;

        for (int i = 0; i < rows; i++) {
            int count = 0;

            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxOnes) {
                maxOnes = count;
                rowIndex = i;
            }
        }

        return rowIndex;
    }
}
