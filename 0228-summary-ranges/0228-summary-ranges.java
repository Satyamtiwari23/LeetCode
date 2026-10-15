class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            while (i + 1 < nums.length &&
                   nums[i + 1] == nums[i] + 1) {
                i++;
            }

            if (first == nums[i]) {
                result.add(String.valueOf(first));
            } else {
                result.add(first + "->" + nums[i]);
            }
        }

        return result;
    }
}