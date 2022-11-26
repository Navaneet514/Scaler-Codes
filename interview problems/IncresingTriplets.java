public class Solution {
    public int solve(int[] A) {

        int ans = 0;
        for(int x = 0; x < A.length; x++) {
            int left = 0;
            for(int i = 0; i < x; i++) {
                if(A[i] < A[x]) left++;
            }
            int right = 0;
            for(int j = x; j < A.length; j++) {
                if(A[j] > A[x]) right++;
            }
            ans = ans + (left * right);
        }
        return ans;
    }
}
