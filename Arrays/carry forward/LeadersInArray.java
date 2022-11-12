public class Solution {
    public int[] solve(int[] A) {
        
        int n = A.length;

        if (n == 1) {
            return A;
        }

        ArrayList<Integer> maxarr = new ArrayList<Integer>();
        maxarr.add(A[n-1]);
        int k = 1;
        int maxnew = A[n-1];
        for(int j = n-2; j >= 0; j--) {
            if (A[j] > maxnew) {
                maxnew = A[j];
                maxarr.add(maxnew);
            }
        }
        int[] arr = maxarr.stream().mapToInt(i -> i).toArray();

        return arr;
    }
}
