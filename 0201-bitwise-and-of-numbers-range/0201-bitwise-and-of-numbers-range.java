class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        String leftbits = Integer.toBinaryString(left);
        String rightbits = Integer.toBinaryString(right);
        while(leftbits.length() < rightbits.length()){
            leftbits = "0" + leftbits;
        }
        StringBuilder result = new StringBuilder();
        boolean common = true;
        for(int i = 0; i < rightbits.length(); i++){
            if(common) {
                if(leftbits.charAt(i) == rightbits.charAt(i)) {
                    result.append(leftbits.charAt(i));
                }else{
                    common = false;
                    result.append('0');
                }
            }else{
                result.append('0');
            }
        }
        return Integer.parseInt(result.toString(), 2);
    }
}