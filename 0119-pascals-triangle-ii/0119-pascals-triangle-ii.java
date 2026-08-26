class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) { 
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    current.add(1);
                } else {
                    current.add(prev.get(j - 1) + prev.get(j));
                }
            }

            prev = current;
        }

        return prev;
    }
}