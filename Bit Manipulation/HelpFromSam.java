public class Solution {
    public int solve(int A) {

        int cnt = 0;
        while (A > 0) {
            if((A & 1) == 1)
                cnt++;
            A = A >> 1;
        }
        return cnt;
    }
}
