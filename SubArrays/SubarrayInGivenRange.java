public class Solution {
    public int[] solve(int[] A, int B, int C) {

        ArrayList<Integer> sub = new ArrayList<Integer>();
        int[] subs = new int[C-B+1];
        for(int i = B; i <= C; i++){
            sub.add(A[i]);
        }

        for(int i = 0; i < sub.size(); i++) {
            subs[i] = sub.get(i);
        }

        return subs;
    }
}
