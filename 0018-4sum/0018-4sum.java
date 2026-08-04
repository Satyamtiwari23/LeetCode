class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
    
        for(int i = 0; i < nums.length - 3; i++) {
    
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
    
            for(int j = i + 1; j < nums.length - 2; j++) {
    
                if(j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
    
                int fst_num = j + 1;
                int lst_num = nums.length - 1;
    
                while(fst_num < lst_num) {
    
                    long sum = (long) nums[i] + nums[j] + nums[fst_num] + nums[lst_num];
    
                    if(sum == target) {
    
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[fst_num]);
                        temp.add(nums[lst_num]);
    
                        res.add(temp);
    
                        fst_num++;
                        lst_num--;
    
                        while(fst_num < lst_num && nums[fst_num] == nums[fst_num - 1]) {
                            fst_num++;
                        }
    
                        while(fst_num < lst_num && nums[lst_num] == nums[lst_num + 1]) {
                            lst_num--;
                        }
                    }
                    else if(sum < target) {
                        fst_num++;
                    }
                    else {
                        lst_num--;
                    }
                }
            }
        }
        return res;
    }
}