import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeenIndex = new int[256]; // ASCII only
        Arrays.fill(lastSeenIndex, -1);

        int windowStart = 0;
        int longestLength = 0;

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char ch = s.charAt(windowEnd);
            int prevIndex = lastSeenIndex[ch];

            // If ch was seen inside the current window, move start right past it
            if (prevIndex >= windowStart) {
                windowStart = prevIndex + 1;
            }

            lastSeenIndex[ch] = windowEnd;

            int currentWindowLength = windowEnd - windowStart + 1;
            if (currentWindowLength > longestLength) {
                longestLength = currentWindowLength;
            }
        }
        return longestLength;
    }
}