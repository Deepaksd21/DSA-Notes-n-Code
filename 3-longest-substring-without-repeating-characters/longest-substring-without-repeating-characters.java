class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];     
        // stores last index + 1
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            // update left pointer to skip duplicates
            left = Math.max(left, last[c]);

            // store last seen index + 1
            last[c] = right + 1;

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}