class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int unique = 1;

        for (int read = 1; read < nums.length; read++) {

            if (nums[read] != nums[read - 1]) {
                nums[unique] = nums[read];
                unique++;
            }

        }

        return unique;        
    }
}