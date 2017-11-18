//Extra space通常指會隨著input變動的空間, 所以不管input為何都只有一個div => O(1)
// Compare: TC: O(log n), SC: O(1) => 不需要處理Overflow
class Solution {
    public boolean isPalindrome(int x) {
        // -12321 -> 12321-
        if (x < 0) return false;
        int div = 1;
        // 12321 / 10000 = 1 -> L
        while (x / div >= 10) {
            div *= 10;
        }
        while (x != 0) {
            int L = x / div;
            int R = x % 10;
            if (L != R) return false; //Continuously compare
            // x = 12321, div = 10000
            // x % div = 2321
            // 2321 / 10 = 232
            x = (x % div) / 10; //去頭尾
            div /= 100;
        }
        return true;
    }
}