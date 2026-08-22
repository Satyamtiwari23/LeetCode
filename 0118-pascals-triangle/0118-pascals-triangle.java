class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascle = new ArrayList<>();
        List<Integer> prev = null;

        for (int i = 0; i < numRows; i++) {

            List<Integer> current = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    current.add(1);
                } else {
                    current.add(prev.get(j - 1) + prev.get(j));
                }
            }

            pascle.add(current);
            prev = current;
        }

        return pascle;
    }
}