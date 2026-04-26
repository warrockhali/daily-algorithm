class Solution {
    public int[] solution(long n) {
        
        String num = "" + n;
        
        int start = 0;
        
        int[] answer = new int[num.length()];
        
        for (int i = num.length() - 1; i >= 0; i--) {
            
            answer[start++] = num.charAt(i) - '0';
            
        }
        
        return answer;
    }
}