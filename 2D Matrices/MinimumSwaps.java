public class Solution {
    public int solve(int[] A, int B) {

        int window = 0;
        int cnt = 0;

        // Find the window size 
        for(int i = 0; i < A.length; i++) {
            if (A[i] <= B) {
                window++;
            }
        }

        // Calculate first window where the subarray lies within value B
        for(int i = 0; i <= window -1; i++) {
            if (A[i] <= B) {
                cnt++;
            }
        }

        // Slide the window till array length to find max no of items in a window
        // and Calculate swaps required.
        int ans = window - cnt;

        int start = 1;
        int end = window;

        while(end < A.length) {
            if (A[end] <= B) cnt++;
            if (A[start-1] <= B) cnt--;
            int tmpans = window - cnt;
            ans = Math.min(ans, tmpans);
            start++;
            end++;
        }
        return ans;
    }
}
