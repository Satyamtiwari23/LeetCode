class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder finalstr = new StringBuilder();
        for(int i = 0, j = 0 ; i < word1.length() || j < word2.length(); i++,j++){
            if(i < word1.length()){
                finalstr.append(word1.charAt(i));
            }
            if(j < word2.length()){
                finalstr.append(word2.charAt(j));
            }
        }
        
        return finalstr.toString();
    }
}