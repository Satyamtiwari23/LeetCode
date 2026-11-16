class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        String bits = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < bits.length(); i++) {
            if(bits.charAt(i) == '1') {
                count++;
            }
            if(count > 1) {
                return false;
            }
        }
        return true;
    }
}