class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numbers.containsKey(complement)) {
                return new int[] { numbers.get(complement), i };
            }
            numbers.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match found!");
    }
}