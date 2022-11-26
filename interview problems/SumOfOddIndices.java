public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> PFE = new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        PFE.add(0);

        for (int i = 1; i < A.size(); i++) {
            if (i%2 == 0) PFE.add(PFE.get(i-1));
            else PFE.add(PFE.get(i-1) + A.get(i));            
        }

        for(int i = 0; i < B.size(); i++) {
            int start = B.get(i).get(0);
            int end = B.get(i).get(1);

            if (start == 0) {
                ans.add(PFE.get(end));
            }
            else {
                ans.add(PFE.get(end) - PFE.get(start-1));
            }
        }
        return ans;
    }
}
