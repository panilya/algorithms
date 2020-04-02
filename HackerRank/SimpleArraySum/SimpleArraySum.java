public class Solution {
    static int simpleArraySum(int[] ar) {
        int sum = 0;

        for (int n : ar) {
            sum += n;
        }
        return sum;
    }
