public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {

        int ME = A[0];
        int freq = 1;

        for(int i = 1; i < A.length; i++) {
            if (A[i] == ME) freq++;
            else {
                if (freq == 0) {
                    ME = A[i];
                    freq = 1;
                }
                else freq--;
            }
        }

        // Count if majority Element Exizts
        
        // int cnt = 0;

        // for(int i = 0; i < A.length; i++) {
        //     if (A[i] == ME) cnt++;
        // }

        // if (cnt > (A.length/2)) {
        //     return ME;
        // }
        return ME;
    }
}
