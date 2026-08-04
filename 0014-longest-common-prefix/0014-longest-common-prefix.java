class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstStr = strs[0];
        int lenShortestStr = firstStr.length();
        for(int i = 0 ; i < strs.length; i++){
            if(strs[i].length() < lenShortestStr){
                lenShortestStr = strs[i].length();
            }
        }
        char ch = 'a';
        String newStr;
        newStr = "";
        int count = 0;
        for (int i = 0; i < lenShortestStr; i++) {
            count = 0 ;
            for(int j = 0 ; j < strs.length -1 ; j++){
                if(strs[j].charAt(i) != strs[j+1].charAt(i)){
                    return newStr;
                }else{
                    count++;
                    ch = strs[j+1].charAt(i);
                }
            }
            if(count == strs.length -1){
                newStr = newStr + ch;
            }
        }
        return newStr;
    }
}