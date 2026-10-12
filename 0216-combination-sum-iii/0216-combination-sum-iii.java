class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(1,k,n,0,list,result);
        return result;
    }
    public static void backtrack(int start, int k, int n,int currSum, List<Integer> list, List<List<Integer>> result) {
        if(currSum > n) {
            return;
        }
        if(k == 0){
            if(currSum == n) {
                result.add(new ArrayList<> (list));
            }
            return;
        }
        for(int i = start; i <= 9; i++) {
            list.add(i);
            backtrack(i+1,k-1,n,currSum+i,list,result);
            list.remove(list.size() - 1);
        }
    }
}