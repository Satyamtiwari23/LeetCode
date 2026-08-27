class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            Set<Integer> set = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int secReq = 0 - nums[i] - nums[j];

                if (set.contains(secReq)) {

                    list.add(Arrays.asList(nums[i], secReq, nums[j]));

                    // Skip duplicate nums[j]
                    while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
                        j++;
                    }
                }

                set.add(nums[j]);
            }
        }

        return list;
    }
}