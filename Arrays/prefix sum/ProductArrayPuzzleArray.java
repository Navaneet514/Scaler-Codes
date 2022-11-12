public class Solution {
    public int[] solve(int[] A) {

        int[] prodarr = new int[A.length];

        int prod = 1;

        for(int i = 0; i < A.length; i++) {
            prod = prod * A[i];
        }

        for(int j = 0; j < prodarr.length; j++) {
            prodarr[j] = prod / A[j];
        }

        return prodarr;
    }
}
