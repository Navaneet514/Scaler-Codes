public class Solution {
    public int[] solve(int[] A, int B, int C) {
        int tmp = 0;
        for(int i = B; i < C; i++) {
            if(i < C) {
                tmp = A[i];
                A[i] = A[C];
                A[C] = tmp;
            }
            C--;
        }
        return A;
    }
}
