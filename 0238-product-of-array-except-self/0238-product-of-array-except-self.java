class Solution {
    public int[] productExceptSelf(int[] nums) {
        int before = 1;
        int answer [] = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            before = i > 0 ? before*nums[i-1]:1;
            answer[i] = before;
        }
        int after = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * after;
            after = after * nums[i];
        }
        return answer;
    }
}