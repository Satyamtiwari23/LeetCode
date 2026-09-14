class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtracking(nums,0,new ArrayList<>() , subsets);
        return subsets;
    }
    public void backtracking(int [] nums, int i, List<Integer>inner, List<List<Integer>>subsets){
        if(i == nums.length){
            subsets.add(new ArrayList(inner));
            return;
        }
        inner.add(nums[i]);
        backtracking(nums,i+1,inner,subsets);
        inner.remove(inner.size() - 1);
        backtracking(nums,i+1,inner,subsets);
    }
}