class Solution {
    public int singleNumber(int[] nums) {

        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total ^= nums[i];
        }
        return total;
    }
}