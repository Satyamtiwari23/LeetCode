class Solution {
    public int romanToInt(String s) {
                HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int finalValue = 0;
        int currValue = 0;
        for (int i = 0; i < s.length(); i++) {
            currValue = map.get(s.charAt(i));
            if (i < s.length() - 1) {
                if (currValue < map.get(s.charAt(i + 1))) {
                    finalValue = finalValue - map.get(s.charAt(i));
                } else {
                    finalValue = map.get(s.charAt(i)) + finalValue;
                }
            } else {
                finalValue = finalValue + currValue;
            }
        }
        return finalValue;
    }
}