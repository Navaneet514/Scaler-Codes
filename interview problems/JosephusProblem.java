public class Solution {
    public int solve(int A) {

        int res = 0;
        for(int i = A; i >= 1; i--) {
        // If i is a power of 2
            if ((i & (i-1)) == 0) {
                res = i;
                break;
            }
        }
        return (1 + 2*(A-res));
    }
}
