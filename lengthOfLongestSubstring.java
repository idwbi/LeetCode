//loop: TC: O(n) , SC: O(1)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] record = new int[256]; //ASCII code
        Arrays.fill(record, -1);
        //for (int i = 0; i < record.length; i++) {
        //    record[i] = -1;
        //}
        // s = "abcabcbb", s.charAt(0) = 'a' = 97
        int cnt = 0, maxLength = 0;
        for (int j = 0; j < s.length(); j++) {
            if (record[s.charAt(j)] >= cnt) {
                cnt = record[s.charAt(j)] + 1; //目前substring的起點
            }
            record[s.charAt(j)] = j; //record[97] = 0
            maxLength = Math.max(maxLength, j - cnt + 1);
        }
        return maxLength;
    }
}