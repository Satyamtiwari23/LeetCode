class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int num = n;
        boolean happy = false;
        while (num > 0) {
            int sum = 0;
            while (num > 0) {
                int lNum = num % 10;
                num = num / 10;
                sum = sum + (lNum * lNum);
            }
            if (sum == 1) {
                happy = true;
                return happy;
            } else if (set.contains(sum)) {
                happy = false;
                return happy;
            }
            set.add(sum);
            num = sum;
        }
        return happy;
    }
}