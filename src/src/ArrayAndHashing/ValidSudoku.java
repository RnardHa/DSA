package ArrayAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean solution() {
        return isValidSudoku(new char[][]{
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','8','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        });
    }

    private boolean isValidSudoku(char[][] board) {
        Set[] rows = new HashSet[9];
        Set[] cols = new HashSet[9];
        Set[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet();
            cols[i] = new HashSet();
            boxes[i] = new HashSet();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                if (rows[i].contains(board[i][j]) || cols[j].contains(board[i][j]) || boxes[(i/3)*3+(j/3)].contains(board[i][j])) {
                    return false;
                }

                rows[i].add(board[i][j]);
                cols[j].add(board[i][j]);
                boxes[(i/3)*3+(j/3)].add(board[i][j]);
            }
        }
        return true;
    }
}
