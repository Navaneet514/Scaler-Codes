public class Solution {
    public int solve(int[] A) {

        int[] pf = new int[A.length];

        int n = pf.length;
        pf[0] = A[0];
        for(int i = 1; i < n; i++) {
            pf[i] = pf[i-1] + A[i];
        }

        for(int j = 0; j < n; j++) {
            int sumL = 0;
            int sumR = 0;

            if(j == 0) {
                sumL = 0;
            }
            else {
                sumL = pf[j-1];
            }
            if (j == n - 1){
                sumR = 0;
            }
            else {
                sumR = pf[n-1] - pf[j];
            }

            if (sumL == sumR){
                return j;
            }
        }
        
        return -1;
    }
}
