public class Solution {
    static void miniMaxSum(int[] arr) {

        long min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;

        for (int value : arr) {
            sum += value;
            min = Math.min(min, value);
            max = Math.max(max, value);
        }

        System.out.println((sum - max) + " " + (sum - min));
    }
