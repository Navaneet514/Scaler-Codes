public class Solution {
    public int solve(int A, int B) {

        int cnt = 0;
        int sum = 0;
        while(A>0){

            int tmp = A%10;;
            sum = sum +(int)(tmp * Math.pow(B,cnt));

            A = A/10;
            cnt++;
        }

        return sum;
    }
}
