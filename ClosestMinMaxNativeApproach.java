public class Solution {
    public int solve(int[] a) {

        int min=a[0],max=a[0];
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }

        if (min == max) {
            return 1;
        }

        for(int j = 0; j < a.length; j++) {
            if (a[j] == min) {
                for(int k = j+1; k < a.length; k++) {
                    if (a[k] == max) {
                        ans = Math.min(ans, (k - j+1));
                    }
                }
            }
            if (a[j] == max) {
                for(int k = j+1; k < a.length; k++) {
                    if (a[k] == min) {
                        ans = Math.min(ans, (k - j+1));
                    }
                }
            }
        }
        return ans;
    }
}
