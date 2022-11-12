public class Solution {
    public int[] solve(int[] A, int[][] B) {
        int [] sum = new int[B.length];
        
        for(int i = 0; i < B.length; i++){
            int start = B[i][0];
            int end = B[i][1];
            int SumOfArray = 0;
            for(int j = start-1; j < end; j++) {
                SumOfArray += A[j];
            }
            sum[i] = SumOfArray;
        }
        return sum;
    }
}
