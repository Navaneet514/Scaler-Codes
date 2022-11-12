public class Solution {
    public int solve(int[] A) {
        int max = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] > max) {
                max = A[i];
            }
        }

        int num = 0;
        for(int i = 0; i < A.length; i++) {
            while (A[i] != max) {
                A[i] += 1;
                num++;
            }
        }
        return num;
    }
}
