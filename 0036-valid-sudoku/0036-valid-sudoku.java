class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board.length != 9 || board[0].length != 9){
            return false;
        }
        for(int i = 0; i < 9; i++){
            HashSet<Character>h_set = new HashSet<>();
            HashSet<Character>v_set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(h_set.contains(board[i][j])){
                        return false;
                    }
                    h_set.add(board[i][j]);
                }
                if(board[j][i] != '.'){
                    if(v_set.contains(board[j][i])){
                        return false;
                    }
                    v_set.add(board[j][i]);
                }

            }
        }
        for(int i = 0; i < 9; i += 3){
            for(int j = 0; j < 9; j +=3){
                HashSet<Character> set = new HashSet<>();
                for(int k = 0; k < 3; k++){
                    for(int l = 0; l < 3; l++){
                        if(board[i+k][j+l] != '.'){
                            if(set.contains(board[i+k][j+l])){
                                return false;
                            }
                            set.add(board[i+k][j+l]);
                        }
                    }
                }
            }
        }
        return true;
    }
}