//modulo:TC: O(log n), SC: O(1), 123%10=3(取最右邊) 3X10=30(左移一位)
//沒有用到額外空間!!! O(1)
class Solution {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            // -2147483648 ~ 2147483647
            if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && x % 10 > 7) || (ans == Integer.MIN_VALUE / 10 && x % 10 < -8)) return 0;
            // 123 -> 321
            ans = ans *10 + x % 10;
            // 0 + 3
            // 30 + 2
            // 320 + 1
            x /= 10;
            // 12
            // 1 
            // 0
        }
        return ans;
    }
}