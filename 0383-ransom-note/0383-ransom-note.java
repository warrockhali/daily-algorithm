class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (magazine.length() < ransomNote.length()) {
            return false;            
        }

        int[] abc = new int[26];

        for (char c : magazine.toCharArray()) {
            abc[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            
            abc[c - 'a']--;
            
            if(abc[c - 'a'] < 0) {
                return false;                
            } 
        }

        return true;
    }
}