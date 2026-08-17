class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        String finalSum = "";
        int i = 0 , j = 0 ;
        for( i = a.length() - 1, j = b.length() -1; i >= 0||j>=0; i--,j--){
            int digitA = 0 , digitB = 0 , sum = 0;
            if(i >= 0){
                digitA = a.charAt(i) - '0';
            }else{
                digitA = 0;
            }
            if(j>=0){
                digitB = b.charAt(j) - '0';
            }else{
                digitB = 0;
            }

            sum = digitA + digitB + carry;

            if(sum == 0){
                carry = 0;
                finalSum = finalSum + sum;
            }
            else if(sum == 1){
                carry =0;
                finalSum = finalSum + sum;
            }
            else if(sum == 2){
                carry =1;
                finalSum = finalSum + "0";
            }
            else{
                carry =1;
                finalSum = finalSum + "1";
            }
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