public class Solution {
    public int solve(String A) {
        int n = A.length();

        int cnt = 0;
        int ans = 0;

        for(int i = n-1; i >= 0; i--) {
            if (A.charAt(i) == 'G') cnt++;
            if (A.charAt(i) == 'A') {
                ans += cnt;
                ans = ans % 1000000007;
            }
        }

        return ans;
    }
}
