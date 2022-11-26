public class Solution {
    public int solve(int A, int B) {

        if(((A >> B) & 1) == 1) return 1;

        return 0;
    }
}
