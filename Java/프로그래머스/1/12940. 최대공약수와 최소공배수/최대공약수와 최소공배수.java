import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = calculateGcd(n, m);
        answer[1] = ( n * m ) / answer[0];
        
        
        return answer;
    }
    
    // 최대 공약수 구하기
    public static int calculateGcd(int n, int m) {
        
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        
        while (b != 0) {
            
            int r = a % b;
            
            a = b;
            b = r;
            
        }
        
        return a;
        
    }
}