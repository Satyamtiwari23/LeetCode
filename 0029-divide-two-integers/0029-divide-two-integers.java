class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = false;
        if(divisor < 0 && dividend > 0 || dividend < 0 && divisor > 0){
            negative = true;
        }

        long dividendValue = Math.abs((long) dividend);
        long divisorValue = Math.abs((long) divisor);

        int finalCount = 0;

        while (dividendValue >= divisorValue) {

            long value = divisorValue;
            int multiple = 1;

            while (dividendValue >= value + value) {
                value = value + value;
                multiple = multiple + multiple;
            }

            dividendValue = dividendValue - value;
            finalCount = finalCount + multiple;
        }

        return negative ? -finalCount : finalCount;
    }
}