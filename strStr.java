//暴力法: SC: O(nm), SC: O(1)
class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length(); i++) { //Include "=" coz both might be ""
            for (int j = 0; j <= needle.length(); j++) { //j是i現在的index再往後推的數
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1; //Can't get ans full search
                if (haystack.charAt(i + j) != needle.charAt(j)) break; //Order important
            }
        }
        throw new IllegalArgumentException("No solution!!!");
    }
}