public class Solution {
    public int[] solve(int[] A) {

        int length = 0;
        int start = 0;
        int sum = 0;
        for (int i=0, j=0; j < A.length; j++) {
            if (sum + A[j] >= sum) {
                sum += A[j];
                if (j-i+1 > length) {
                    length = j-i+1;
                    start = i;
                }
            }
            else {
                i = j + 1;
            }
        }
        int[] res = new int[length];
        for (int k=0; k<length; k++) {
            res[k] = A[start++];
        }
        return res;        
    }
}
