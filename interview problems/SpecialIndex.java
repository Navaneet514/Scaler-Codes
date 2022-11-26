public class Solution {
    public int solve(int[] A) {

        int[] pfe = new int[A.length];
        int[] pfo = new int[A.length];
        int n = A.length;
        pfe[0] = A[0];
        pfo[0] = 0;

        for(int i = 1; i < A.length; i++) {
            if (i%2 == 1) pfe[i] = pfe[i-1];
            else pfe[i] = pfe[i-1] + A[i];
        }

        for(int i = 1; i < A.length; i++) {
            if (i%2 == 0) pfo[i] = pfo[i-1];
            else pfo[i] = pfo[i-1] + A[i];
        }

        int sumOddIndex = 0, sumEvenIndex = 0;

        for(int i = 0; i < A.length; i++) {
            if(i%2 == 0) sumEvenIndex += A[i];
        }

        for(int i = 0; i < A.length; i++) {
            if(i%2 == 1) sumOddIndex += A[i];
        }

        int SumOddAfter = 0, SumEvenAfter = 0;
        int total = 0;
        for(int i = 0; i < A.length; i++) {
            if (i == 0) {
                SumEvenAfter = pfo[n-1] + pfo[i];
                SumOddAfter = pfe[n-1] + pfe[i];
            } else {
                SumEvenAfter = pfe[i-1] + (pfo[n-1] - pfo[i]);
                SumOddAfter = pfo[i-1] + (pfe[n-1] - pfe[i]);
            }
            if(SumEvenAfter == SumOddAfter){
                total++;
            }
        }
        return total;
    }
}
