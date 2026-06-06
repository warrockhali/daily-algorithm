import java.util.*;

class Solution {
    public boolean solution(String s) {        
        boolean answer = true;
        
        if (s.length() == 4 || s.length() == 6) {
            
            for (int i = 0; i < s.length(); i++) {
                
               boolean result = Character.isDigit(s.charAt(i)); 
                
               if(!result) {
                 return false;                   
               }
            }
            
        }else {
            return false;
        }
            
        
        return answer;
    }
}