public class Solution {
    public int[] solve(int[] A, int[][] B) {

        int[] even = new int[B.length];

        for(int i = 0; i < B.length; i++) {
            int start = B[i][0];
            int end = B[i][1];
            int cnt = 0;
            for(int j = start; j <= end; j++) {
                if (A[j] % 2 == 0) {
                    cnt++;
                }
            }
            even[i] = cnt;
        }
        return even;
    }
}
