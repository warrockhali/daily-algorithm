class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            
            int min = Math.min(sizes[i][0], sizes[i][1]);
            int max = Math.max(sizes[i][0], sizes[i][1]);
            
            sizes[i][0] = max;
            sizes[i][1] = min;
        }
        
        int max1 = sizes[0][0];
        int max2 = sizes[0][1];
        
        for (int i = 0; i < sizes.length; i++) {
            
            if (max1 <= sizes[i][0]) {
                max1 = sizes[i][0];
            }
            
            if (max2 <= sizes[i][1]) {
                max2 = sizes[i][1];
            }
        }        
        
        return max1 * max2;
    }
}