class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);
        int current = nums[0], prev = 0, next = 1;
        current++;
        while(current < nums[nums.length -1] && next < nums.length){
            if(current > nums[prev] && current < nums[next]){
                ls.add(current);
                current++;
            }else if(current == nums[prev] || current == nums[next]){
                current++;
            }else{
                prev++;
                next++;
            }
        }

        return ls;
    }
}