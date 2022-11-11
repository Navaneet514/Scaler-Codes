public class Solution {
    public long subarraySum(int[] A) {
        int n = A.length;
        long sums = 0;
        // Contribution Method
        for(int i = 0; i < n; i++) {
            long NoOfTimesI = (long) (i+1) * (n-i);
            long ContributionI = NoOfTimesI * (long)A[i];
            sums += ContributionI;

            // For one line 
            // ans += (long)(i + 1) * (n - i) * A[i];
        }
        return sums;
    }
}
