public class Solution {
    public int solve(int A, int B) {
        
        int num = 0;
        num = num | (1 << A);
        num = num | (1 << B);
        return num;
    }
}
