public class Solution {
    public int[][] solve(int[][] A) {
        int N=A.length;
        int M=A[0].length;
        int zero[][]=new int[N][M];
        int row[]=new int[N];
        int col[]=new int[M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(row[i]!=1 && col[j]!=1){
                    zero[i][j]=A[i][j];
                }
            }
        }
        return zero;
    }
}
