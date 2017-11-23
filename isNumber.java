//loop: TC: O(n), SC: O(1)
class Solution {
    public boolean isNumber(String s) {
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') i++; //空白字元
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++; //正負號
        
        //判斷是不是數字
        boolean isNum = false;
        while (i < n && Character.isDigit(s.charAt(i))) {
            i++;
            isNum = true;
        }
        
        //找到小數點: .2, 2.都有效
        if (i < n && s.charAt(i) == '.') {
            i++;
            while (i < n && Character.isDigit(s.charAt(i))) {
                i++;
                isNum = true;
            }
        }
        
        //科學記號: 2e, e2都無效, 2e+10, 2e-10都有效
        if (isNum && i < n && s.charAt(i) == 'e') {
            i++;
            isNum = false; //e2
            if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
            while (i < n && Character.isDigit(s.charAt(i))) {
                i++;
                isNum = true;
            }
        }
        while (i < n && s.charAt(i) == ' ') i++; //空白字元
        
        return isNum && i == n;
    }
}