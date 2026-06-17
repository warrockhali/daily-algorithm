class Solution {
    public String solution(String rawText) {
        StringBuilder resultBuilder = new StringBuilder();
        
        int wordIndex = 0; 
        
        for (char ch : rawText.toCharArray()) {
            
            if (ch == ' ') {
                resultBuilder.append(ch);
                wordIndex = 0; 
            } else {
                if (wordIndex % 2 == 0) {
                    resultBuilder.append(Character.toUpperCase(ch));
                } else {
                    resultBuilder.append(Character.toLowerCase(ch));
                }
                
                wordIndex++; 
            }
        }
        
        return resultBuilder.toString();
    }
}