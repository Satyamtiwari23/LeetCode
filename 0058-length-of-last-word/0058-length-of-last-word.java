class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String word = " ";
        for(int i = s.length() - 1; i >= 0; i--){
            if(word == " " && s.charAt(i) == ' '){
                continue;
            }else if (s.charAt(i) != ' '){
                word = word + s.charAt(i);
                count++;
            }else if(word != " " && s.charAt(i) == ' '){
                break;
            }
        }
        return count;
    }
}