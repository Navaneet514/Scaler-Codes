public class Solution {
    public int solve(int[] A, int[] B) {

        int totalCost = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            int leftCost = Integer.MAX_VALUE;
            int rightCost = Integer.MAX_VALUE;
            for(int j=0;j<i;j++)
            {
                if(A[j]<A[i])
                leftCost = Math.min(leftCost, B[j]);
            }
            for(int k=i+1;k<A.length;k++)
            {
                if(A[k]>A[i])
                rightCost = Math.min(rightCost,B[k]);
            }
            if(leftCost!= Integer.MAX_VALUE && rightCost != Integer.MAX_VALUE )
                totalCost = Math.min(totalCost,B[i]+leftCost+rightCost);
        }
        if(totalCost==Integer.MAX_VALUE)
            return -1;
        return totalCost;
    }
}
