class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int k = 0;
                for (int j = i; j < haystack.length() && k < needle.length(); j++, k++) {
                    if (haystack.charAt(j) != needle.charAt(k)) {
                        break;
                    }
                }
                if (k == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}