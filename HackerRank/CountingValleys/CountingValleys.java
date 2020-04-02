public class Solution {
    static int countingValleys(int n, String s) {

        int altitude = 0;
        int num_valleys = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                if (altitude == -1) {
                    num_valleys++;
                }
                altitude++;
            }
            if (s.charAt(i) == 'D') {
                altitude--;
            }
        }
        return num_valleys;
    }
