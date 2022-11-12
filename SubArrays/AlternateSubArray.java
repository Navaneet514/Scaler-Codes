public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        int c = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(B == 0)  res.add(0);
        for(int i = 1; i<A.size(); i++) {            
            if(B == 0) {
                res.add(i);
            }
            else {
                if(A.get(i) != A.get(i-1)){
                    c++;  
                    if(c >=  B*2)
                        res.add(i-B);                    
                }else{
                    c = 0;
                }
            }
        }
        return res;
    }
}
