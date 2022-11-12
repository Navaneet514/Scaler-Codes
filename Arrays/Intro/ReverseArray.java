public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A) {
        int j = A.length - 1;
        int tmp = 0;
        
        for(int i = 0; i < A.length; i++) {
            if(i < j) {
                tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
            j--;
        }

        return A;
    }
}
