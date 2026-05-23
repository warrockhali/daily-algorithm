class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        int p = 0;
        
        for(int i = 0; i < seoul.length; i++) {
            
            if(seoul[i].equals("Kim")) {
                p = i;
            }          
            
        }
        
        answer = "김서방은 " + p + "에 있다";
        
        return answer;
    }
}