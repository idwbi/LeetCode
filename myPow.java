//TC: O(log n), SC: O(1)
class Solution {
    public double myPow(double x, int n) {
        //pow(3, 4) = 3*3*3*3 = (3*3)*(3*3) = pow(4, 2)
        //pow(2, 5) = 2*4*4 = 2*pow(4, 2)
        //pow(2, -4) = 1 / pow(2, 4)
        if (n == 0) return 1;
        if (n == Integer.MIN_VALUE) { //Handle number should consider overflow
            x = x * x;
            n = n / 2;
        }
        if (n < 0) {
            n *= -1; //If n is Integer.MIN_VALUE => overflow
            x = 1 / x;    
        }
        if (n % 2 == 0) return myPow(x * x, n / 2);
        else return x * myPow(x * x, n / 2); 
    }
}