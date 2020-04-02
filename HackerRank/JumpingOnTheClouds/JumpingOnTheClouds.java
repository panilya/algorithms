public class Solution {
    static int jumpingOnClouds(int[] c) {

        int jumps = 0;
        int i = 0;

        while (i < c.length - 1) {
            if (i + 2 == c.length || c[i + 2] == 1) {
                i++;
                jumps++;
            } else {
                i += 2;
                jumps++;
            }
        }
        return jumps;
    }
