class Solution {
    public static int[] twoSum(int arr[] , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                int arr1[] = {map.get(complement) , i};
                return arr1;
            }
            else{
                map.put(arr[i] , i);
            }
        }
        return new int[]{};
    }
}