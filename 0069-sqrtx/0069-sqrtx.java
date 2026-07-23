class Solution {
    public int mySqrt(int x) {
        
        for (int i = 1; ; i++) {

            if ((long) i * i > x) {
                return i - 1;
            }
        }
    }
}