public class Solution {
    public int maxSubarray(int A, int B, ArrayList<Integer> C) {

        int ans = 0;
        for(int i = 0; i < A; i++){
            int sum = 0;
            for(int j = i; j < A; j++){
                sum += C.get(j);
                if(sum > ans && sum <= B) ans=sum;
            }
        }
        return ans;
    }
}
