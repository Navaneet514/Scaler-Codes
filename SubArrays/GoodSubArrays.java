public class Solution {
    public int solve(ArrayList<Integer> A, int B) {

        int c = 0;
        int sum;
        for(int i = 0; i < A.size(); i++) {
            sum = 0;
            for(int j = i; j < A.size(); j++){
                sum += A.get(j);
                if((j-i+1)%2 == 0 && sum < B){
                   c++;
                }
                if((j-i+1)%2 != 0 && sum > B) {
                   c++;
                }    
            }
        }
        return c;
    }
}
