public class Solution {
    public int[] solve(int[][] A) {

        int[] rowsumarr = new int[A.length];

        for(int i = 0; i < A.length; i++) {
            int rowsum = 0;
            for(int j = 0; j < A[0].length; j++) {
                rowsum += A[i][j];
            }
            rowsumarr[i] = rowsum;
        }
        return rowsumarr;
    }
}
