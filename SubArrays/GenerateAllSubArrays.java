public class Solution {

    public ArrayList<Integer> subarray(ArrayList<Integer> A, int s, int e) {
        ArrayList<Integer> sub = new ArrayList<Integer>();
        for(int i = s; i <= e; i++){
            sub.add(A.get(i));
        }
        return sub;
    }
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> subarrays = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < A.size(); i++) {
            for(int j = i; j < A.size(); j++) {
                subarrays.add(subarray(A, i, j));
            }
        }
        return subarrays;
    }
}
