public class Solution {
    public long solve(long A, int B) {

        int cnt = 0;
        while (cnt < B) {
            A = (A & ~(1 << cnt));
            cnt++;
        }

        return A;
    }
}
