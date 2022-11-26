public class Solution {
    public int repeatedNumber(int[] A) {
        int candidate1 = A[0];
        int freq1 = 0;
        int candidate2 = 0;
        int freq2 = 0;
        int n = A.length;
        int pos = 0;
        for(int i = 0;i < n;i++) {
           if(A[i] == candidate1) {
                freq1++;
            } else {
                candidate2 = A[i];
                freq2=1;
                pos = i;
                break;
            }
        }
        for(int i = pos + 1;i < n;i++) {
            if(A[i] == candidate1) {
                freq1++;
            } else if(A[i] == candidate2) {
                freq2++;
            } else if(freq1 == 0) {
                candidate1 = A[i];
                freq1 = 1;
            }else if(freq2 == 0) {
                candidate2 = A[i];
                freq2 = 1;
            } else {
                freq1--;
                freq2--;
            }
        }
        freq1 = 0;
        freq2 = 0;
        for(int i = 0;i < n;i++) {
            if(A[i] == candidate1) {
                freq1++;
            }
            if(A[i] == candidate2) {
                freq2++;
            }
        }
        if(freq1 > n/3) {
            return candidate1;
        }
        if(freq2 > n/3) {
            return candidate2;
        }
        return -1;
    }
}
