public class Solution {
    public String solve(int[] A) {

        int ans = 0;

        for(int i = 0; i < A.length; i++) {
            ans = ans ^ A[i];
        }

        if (ans % 2 == 0) {
            return "Yes";
        }
        return "No";
    }
}
