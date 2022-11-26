public class Solution {
    public int DecimalToAnyBase(int A, int B) {
        int ans = 0;
        int rem = 0;
        int i = 0;
        while (A > 0) {
            rem = A%B;
            ans += rem * (int) Math.pow(10, i); 
            A /= B;
            i++;
        }
        return ans;
    }
}
