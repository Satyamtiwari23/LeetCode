class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 , right = 0 , length = 0;
        Set <Character> set = new HashSet<>();
        while(right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                length = Math.max(length, right - left);
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return length;
    }
}