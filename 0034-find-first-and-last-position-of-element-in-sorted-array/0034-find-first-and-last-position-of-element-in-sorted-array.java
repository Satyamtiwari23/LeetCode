class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        int left = 0 , right = nums.length - 1;
        ans[0] = -1;
        ans[1] = -1;
        while(left <= right){
            int mid = left+(right - left)/2;
            if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                ans[0] = mid;
                right = mid - 1;
            }
        }
        left = 0;
        right = nums.length - 1;
        while(left <= right){
            int mid = left+(right - left)/2;
            if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                ans[1] = mid;
                left = mid + 1;
            }
        }
        return ans;
    }
}