class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums) {
            if(map.containsKey(num)) {
                map.put(num,map.get(num) + 1);
            } else {
                map.put(num,1);
            }
        }
        int[] result = new int[2];
        int index = 0;

        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                result[index] = num;
                index++;
            }
        }
        return result;

    }
}