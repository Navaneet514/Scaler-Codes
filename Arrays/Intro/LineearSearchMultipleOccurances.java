public class Solution {
    public int solve(int[] A, int B) {
        int cnt = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] == B) {
                cnt++;
            }
        }

        return cnt;
    }
}
