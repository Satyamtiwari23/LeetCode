class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0 , fuel = 0 , start = 0;
        for(int i = 0; i < gas.length; i++){
            totalGas += gas[i] - cost[i];
            fuel += gas[i] - cost[i];
            if(fuel < 0){
                start = i + 1;
                fuel = 0;
            }
        }
        if(totalGas < 0){
            return -1;
        }
        return start;
    }
}