public class Solution {
    public int solve(int[] A, int B, int C) {

        int sum = 0;

        if (A.length == 1) {
            if (A[0] == C) {
                return 1;
            }
        }

        for(int i = 0; i <= B-1; i++) {
            sum += A[i];
        }

        int start = 1;
        int end = B;

        while(end < A.length) {
            sum -= A[start-1];
            sum += A[end];
            if (sum == C) return 1;
            start++;
            end++;
        }
        return 0;
    }
}
