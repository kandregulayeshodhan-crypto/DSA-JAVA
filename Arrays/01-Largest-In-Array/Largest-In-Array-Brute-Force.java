import java.util.Arrays;

class Solution {
    public int largest(int[] arr) {

        Arrays.sort(arr);

        return arr[arr.length - 1];
    }
}
