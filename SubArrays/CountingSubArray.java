public class Solution {
    public int solve(ArrayList<Integer> A, int B) {

        int c = 0;

        for(int i = 0; i < A.size(); i++) {
            int sum = 0;
            for(int j = i; j < A.size(); j++) {
                sum += A.get(j);
                if(sum < B) {
                    c++;
                }
            }
        }
        return c;
    }
}
