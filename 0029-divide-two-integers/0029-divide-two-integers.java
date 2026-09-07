class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if(divisor == -1){
            return -dividend;
        }
        boolean negative = false;
        if(divisor < 0 && dividend > 0 || dividend < 0 && divisor > 0){
            negative = true;
        }

        long dividendValue = Math.abs((long) dividend);
        long divisorValue = Math.abs((long) divisor);

        int count = 0;

        while (dividendValue >= divisorValue) {
            dividendValue = dividendValue - divisorValue;
            count++;
        }

        return negative ? -count : count;
    }
}