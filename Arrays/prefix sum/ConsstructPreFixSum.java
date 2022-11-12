public class Solution {
    public int[] solve(int[] A) {

        A[0] = A[0];

        for(int i = 1; i < A.length; i++) {
            A[i] = A[i-1] + A[i];
        }

        return A;
    }
}
