import java.util.*;

class Main {
    public static void main(String[] args){
        
        int A = 2;
        int B = 1;
        String v= "";
        for(int i = 0; i < A; i++){
            v += '1';
        }
        for(int i = 0; i < B; i++){
            v += '0';
        }
        
        System.out.println(Integer.parseInt(v,2));
        
    }
}
