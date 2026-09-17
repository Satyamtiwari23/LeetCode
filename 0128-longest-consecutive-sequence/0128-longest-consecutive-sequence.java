class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int finalCount = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 1 , j = i;
            while(j < nums.length -1){
                if(nums[j] == nums[j+1]){
                    j++;
                    continue;
                }
                if(nums[j] == nums[j+1] - 1){
                    count++;
                    j++;
                }else{
                    break;
                }
            }
            finalCount = Math.max(count, finalCount);
            i = j;
        }
        return finalCount;
    }
}