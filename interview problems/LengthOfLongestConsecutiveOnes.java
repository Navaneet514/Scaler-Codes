public class Solution {
    public int solve(String A) {
        int n = A.length();

        int cnt = 0;
        for(int i = 0; i < n; i++){
            if (A.charAt(i) == '1'){
                cnt++;
            }
        }

        if (cnt == n) return cnt;

        int maxans = 0;
        for(int i = 0; i < n; i++){
            int tempans = 0;
            if(A.charAt(i) == '0') {
                int l = 0, r = 0;
                for(int j = i-1; j >= 0; j--){
                    if (A.charAt(j) == '1') l++;
                    else break;
                }
                for(int j = i+1; j < n; j++) {
                    if (A.charAt(j) == '1') r++;
                    else break;
                }
                if (l+r == cnt) tempans = l+r;
                else tempans = l+r+1;
            }
            maxans = Math.max(maxans, tempans);
        }
        return maxans;
    }
}
