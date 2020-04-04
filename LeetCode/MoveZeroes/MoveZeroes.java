class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0;
        for (int j = 0, l = nums.length; j < l; ) {
            if (nums[j] == 0) j++;
            else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        while (i < nums.length) nums[i++] = 0;
    }
} 
    
