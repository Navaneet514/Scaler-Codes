public class Solution {
    public long solve(int A, int[] B) {

        int last=0;
        long ans=0;
        for(int i=0;i<A;i++){
            if(B[i]==1){
               last=i+1;
            }
            ans=ans+last;
        }
        return ans;
    }
}
