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

        int mini = -1, maxi = -1;
        for(int j = a.length-1; j >= 0; j--) {
            if(a[j] == max) {
                if (mini != -1) {
                    ans = Math.min(ans, (mini - j + 1));
                }
                maxi = j;
            }
            if(a[j] == min) {
                if (maxi != -1) {
                    ans = Math.min(ans, (maxi - j + 1));
                }
                mini = j;
            }
        }
        return ans;
    }
}
