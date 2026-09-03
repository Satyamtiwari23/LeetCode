class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> notSpecial = new HashSet<>();
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                if (set.contains(nums[i])) {
                    if (!notSpecial.contains(nums[i])) {
                        size--;
                        notSpecial.add(nums[i]);
                    }
                } else {
                    set.add(nums[i]);
                    size++;
                }
            }
        }
        return size;
    }
}