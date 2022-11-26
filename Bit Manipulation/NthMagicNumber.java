public class Solution {
    public int solve(int A) {
        
        int magicNum = 0;
        int mulVal = 5;

        while (A > 0){
            int rem = A % 2;
            magicNum = magicNum + (rem * mulVal);
            A = A/2;
            mulVal = mulVal * 5;
        }

        return magicNum;
    }
}
