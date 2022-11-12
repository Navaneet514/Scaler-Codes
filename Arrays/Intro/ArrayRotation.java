public class Solution {
    public int[] solve(int[] A, int B) {

        int n = A.length;
        int k = B%n;

        if (k == 0) {
            return A;
        }

        int j = A.length - 1;
        int tmp = 0;

        // Step 1: Reverse the whole array
        for(int i = 0; i < A.length; i++) {
            if(i < j) {
                tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
            j--;
        }
        
        // Step2: Reverse 0 to (k-1)
        int start1 = 0;
        int end1 = k - 1;
        int tmp1 = 0;
        for(int i = start1; i < end1; i++) {
            if(i < end1) {
                tmp1 = A[i];
                A[i] = A[end1];
                A[end1] = tmp1;
            }
            end1--;
        }
        
        // Step 3: Rotate k to n-1
        int start2 = k;
        int end2 = A.length - 1;
        int tmp2 = 0;
        for(int i = start2; i < end2; i++) {
            if(i < end2) {
                tmp2 = A[i];
                A[i] = A[end2];
                A[end2] = tmp2;
            }
            end2--;
        }
        return A;
    }
}
