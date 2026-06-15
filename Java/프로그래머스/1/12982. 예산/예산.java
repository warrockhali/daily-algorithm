import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        int i = 0;
        
        while (budget != 0) {
            
            if (i < d.length && budget - d[i] >= 0) {

                budget -= d[i];
                i++;
                answer++;
                
            }else {
                break;
            }
            
        }
        
        return answer;
    }
}