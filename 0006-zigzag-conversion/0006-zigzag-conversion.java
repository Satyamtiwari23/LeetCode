class Solution {
    public String convert(String s, int numRows) {
        
        // If there is only one row, no zigzag is possible
        if (numRows == 1 || numRows == 0 || numRows >= s.length()) {
            return s;
        }

        StringBuilder result = new StringBuilder();

        // Complete cycle length
        int jump = 2 * numRows - 2;

        // Go through each row
        for (int row = 0; row < numRows; row++) {

            int index = row;

            // First row and last row
            if (row == 0 || row == numRows - 1) {

                while (index < s.length()) {

                    result.append(s.charAt(index));

                    index = index + jump;
                }

            }

            // Middle rows
            else {

                int firstJump = jump - 2 * row;
                int secondJump = 2 * row;

                boolean first = true;

                while (index < s.length()) {

                    result.append(s.charAt(index));

                    if (first) {
                        index = index + firstJump;
                        first = false;
                    } else {
                        index = index + secondJump;
                        first = true;
                    }
                }
            }
        }

        return result.toString();
    }
}