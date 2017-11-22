//loop: TC: O(n), SC: O(1)
/*
string非數字
string有數字也有非數字
Overflow
空白字元
正負號
*/
class Solution {
    public int myAtoi(String str) {
        int L = 0, R = str.length(), sign = 1;
        while (L < R && str.charAt(L) == ' ') L++;
        if (L < R && str.charAt(L) == '-') {
            sign = -1;
            L++;
        } else if (L < R && str.charAt(L) == '+') L++;
        
        int ans = 0;
        while (L < R && Character.isDigit(str.charAt(L))) {
            int x = Character.getNumericValue(str.charAt(L));
            
            //Overflow: -2147483648 ~ 2147483647
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && x >= 8)) return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            // "1234" -> 1234
            ans = ans * 10 + x;
            L++;
        }
        return sign * ans;
    }
}