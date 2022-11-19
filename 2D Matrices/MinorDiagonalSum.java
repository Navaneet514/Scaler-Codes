public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {

        int i = 0, j = A[0].length-1;
        int SumMinorDiag = 0;
        while(i < A.length) {
            SumMinorDiag += A[i][j];
            i++;
            j--;
        }
        return SumMinorDiag;
    }
}
