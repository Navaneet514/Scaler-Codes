public class Solution {
    public int solve(int[] A, int B) {

        int n = A.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(i != j && A[i] + A[j] == B) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
