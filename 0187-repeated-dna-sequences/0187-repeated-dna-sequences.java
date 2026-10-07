class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();

        if (s.length() < 11) {
            return list;
        }
        HashSet <String> set = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String current = s.substring(i,i+10);
            if(set.contains(current)&& !list.contains(current)){
                list.add(current);
            }else{
                set.add(current);
            }
        }

        return list;
    }
}