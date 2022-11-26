public class Solution {
    public int[][] solve(int[] A, int[] B) {

        int[][] result = new int[B.length][A.length];
        for(int i=0; i<B.length;i++){
            int k = B[i] % A.length;

            // Reverse the entire array
            for(int s=0,e=A.length-1; s<A.length; s++,e--){
                result[i][e] = A[s];
            }

            // Reverse 0 to A.length - k
            int brkpoint =( A.length - k) -1;
            for(int a=0,b=brkpoint; a<b; a++,b--){
                int temp = result[i][a];
                result[i][a] = result[i][b];
                result[i][b] = temp;
            }

            // Reverse last k elements
            for(int a=brkpoint+1,b=A.length-1; a<b; a++,b--){
                int temp = result[i][a];
                result[i][a] = result[i][b];
                result[i][b] = temp;
            }

        }
        return result;
    }
}
