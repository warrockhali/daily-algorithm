import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        Long pNum = Long.parseLong(p);
        
        for (int i = 0; i < t.length(); i++) {
            
            if (i + p.length() <= t.length()) {
                String num = t.substring(i, i + p.length());
                
                if (Long.parseLong(num) <= pNum) {
                    answer++;
                }
            }
            
        }
        
        return answer;
    }
}