public class Solution {
	public long reverse(long A) {
        if (A == 0) return 0;

        long ans = 0;
        for (int i = 31; i >= 0 ; i--)
        {
            if (((A >> i) & 1) != 0)
            {
                ans += (1l << (31 - i));
            }
           
        }

        return ans;
	}
}
