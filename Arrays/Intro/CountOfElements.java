public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int ans = 0;
        int max = A[0];
        for(int i = 0; i < n; i++){
            if (A[i] > max){
                max = A[i];
            }
        }
        
        for (int j = 0; j < n; j++) {
            if (A[j] < max) {
                ans++;
            }
        }
        return ans;
    }
}
