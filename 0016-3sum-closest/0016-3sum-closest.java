class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i+1;
            int right = nums.length - 1;
            int currSum = 0;
            while(left < right){
                currSum = nums[i] + nums[left] + nums[right];
                if(currSum == target){
                    return currSum;
                }
                if(Math.abs(target-currSum) < Math.abs(target-closest)){
                    closest = currSum;
                }

                if(currSum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return closest;
    }
}