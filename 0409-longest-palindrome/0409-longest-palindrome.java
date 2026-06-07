class Solution {
    public int longestPalindrome(String s) {
        
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean isOdd = false;

        for (int num : map.values()) {
            length += (num / 2) * 2;

            if (num % 2 == 1) {
                isOdd = true;
            }
            
        }

        if (isOdd) {
            length++;
        }

        return length;
    }
}