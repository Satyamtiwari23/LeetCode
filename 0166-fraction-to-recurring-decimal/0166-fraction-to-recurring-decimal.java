class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        
        // Denominator cannot be zero
        if (denominator == 0) {
            return null;
        }

        // 0 divided by anything is 0
        if (numerator == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        // Add negative sign if exactly one is negative
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        // Convert to long before Math.abs()
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // Integer part
        long integerPart = num / den;
        result.append(integerPart);

        // Remainder
        long remainder = num % den;

        // No decimal part
        if (remainder == 0) {
            return result.toString();
        }

        result.append(".");

        // remainder -> position in result
        HashMap<Long, Integer> map = new HashMap<>();

        while (remainder != 0) {

            // Same remainder means repeating decimal
            if (map.containsKey(remainder)) {

                int index = map.get(remainder);

                result.insert(index, '(');
                result.append(')');

                break;
            }

            // Store where this remainder first appeared
            map.put(remainder, result.length());

            // Generate next decimal digit
            remainder *= 10;

            result.append(remainder / den);

            // Calculate next remainder
            remainder %= den;
        }

        return result.toString();
    }
}