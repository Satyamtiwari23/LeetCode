class Solution {
    public String longestPalindrome(String s) {
        String longest="";
        for(int i = 0; i < s.length(); i++){
            //Odd length
            int left = i, right = i;
            while(left >= 0 && right < s.length() && s.charAt(left)== s.charAt(right)){
                left--;
                right++;
            }
            left++;
            right--;
            if(right - left + 1 > longest.length()){
                longest = s.substring(left,right+1);
            }
            //even length
            left = i;
            right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left)== s.charAt(right)){
                left--;
                right++;
            }
            left++;
            right--;
            if(right - left + 1 > longest.length()){
                longest = s.substring(left,right+1);
            }
        }
        return longest;
    }
}