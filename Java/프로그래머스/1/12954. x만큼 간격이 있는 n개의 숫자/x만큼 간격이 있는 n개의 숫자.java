import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        long inc = 1;
        
        for (int i = 0; i < n; i++) {
            answer[i] = x * inc++;
        }
       
        return answer;
    }
}