import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = n + "";
        
        Integer[] nums = new Integer[str.length()];
        
        for(int i = 0; i < str.length(); i++) {
            
            nums[i] = str.charAt(i) - '0';
            
        }
        
        Arrays.sort(nums, Collections.reverseOrder());
        
        String str2 = "";
        
        for(int i = 0; i < str.length(); i++) {
            
            str2 += nums[i];
            
        }
        
        answer = Long.parseLong(str2);
        
        return answer;
    }
}