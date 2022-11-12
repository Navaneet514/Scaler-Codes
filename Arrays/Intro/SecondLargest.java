public class Solution {
    public int solve(int[] A) {
        if(A.length == 1) {
            return -1;
        }

        int max = 0, max2 = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] > max) {
                max = A[i];
            }
        }
        
        for(int j = 0; j < A.length; j++) {
            if(A[j] > max2 && A[j] < max) {
                max2 = A[j];
   
            }
        }

        return max2;
    }
}
