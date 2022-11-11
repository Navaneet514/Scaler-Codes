public class Solution {

    // public long SumSub(int[] A, int s, int e) {
    //     long sum = 0;
    //     for(int i = s; i <= e; i++) {
    //         sum += A[i];
    //     }
    //     return sum;
    // }
    public long subarraySum(int[] A) {
        int n = A.length;
        long sums = 0;
        long[] pf = new long[A.length];
        pf[0] = A[0];

        for(int i = 1; i <A.length; i++) {
            pf[i] = pf[i-1] + (long)A[i];
        }
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if (i == 0) {
                    sums += pf[j];
                }
                if (i > 0) {
                    sums += pf[j] - pf[i-1];
                }
                //sums = sums + SumSub(A, i, j);
            }
        }
        return sums;
    }
}
