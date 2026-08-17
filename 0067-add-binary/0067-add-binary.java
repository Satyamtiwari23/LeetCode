class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        String finalSum = "";
        int i = a.length() -1;
        int j = b.length() - 1;
        while(i >= 0 || j >= 0){
            int digitA = 0, digitB = 0 , sum = 0;
            if(i >= 0){
                digitA = a.charAt(i) -'0';
            }else{
                digitA = 0;
            }
            if(j >= 0){
                digitB = b.charAt(j) - '0';
            }else{
                digitB = 0;
            }
            sum = digitA + digitB + carry;
            int digit = sum % 2;
            carry = sum /2;

            finalSum = finalSum + digit;

            i--;
            j--;
        }
        if(carry == 1){
            finalSum = finalSum + "1";
        }

        String answer="";
        for( i = finalSum.length()-1; i>=0 ; i--){
            answer = answer + finalSum.charAt(i);
        }

        return answer;
    }
}