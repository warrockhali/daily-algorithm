import java.io.*;
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if (s.charAt(0) == '-') {
            
            String str = "";
            
            for(int i = 1; i < s.length(); i++) {
                str += s.charAt(i);
            }
            
            answer = - Integer.parseInt(str);
        }else if  (s.charAt(0) == '+') {
             String str = "";
            
            for(int i = 1; i < s.length(); i++) {
                str += s.charAt(i);
            }
            
            answer = Integer.parseInt(str);
        }else {
             answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}