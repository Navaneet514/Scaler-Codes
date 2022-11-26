public class Solution {
    public int numSetBits(int A) {

        int cnt = 0;

        while(A > 0) {
            if((A & 1) == 1) cnt++;

            A >>= 1;
        }

        return cnt;
    }
}
