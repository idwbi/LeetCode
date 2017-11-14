// for loop: TC: O(n), SC: O(n), be careful increasing the digit.
class Solution {
    public int[] plusOne(int[] digits) {
        //[2, 7, 1, 8] -> [2, 7, 1, 9]
        //[2, 7, 1, 9] -> [2, 7, 2, 0]
        //[9, 9] -> [1, 0, 0]
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else { //digits[i] == 9
                digits[i] = 0;
            }
        }
        int[] ans = new int[digits.length + 1]; //default ans: {0, ...,0}
        ans[0] = 1;
        return ans;
    }
}