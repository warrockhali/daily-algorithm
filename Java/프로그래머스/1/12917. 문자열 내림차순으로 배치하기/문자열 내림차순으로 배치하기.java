import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] charArray = s.toCharArray();
        
        Arrays.sort(charArray);
        
        answer = new StringBuilder(new String(charArray)).reverse().toString();
        
        
        return answer;
    }
}