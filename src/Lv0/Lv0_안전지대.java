package Lv0;

public class Lv0_안전지대 {
    class Solution {
        public int solution(int[][] board) {
            int n = board.length;
            int safe = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 0) {
                        boolean isSafe = true;
                        for (int x = i - 1; x <= i + 1 && isSafe; x++) {
                            for (int y = j - 1; y <= j + 1 && isSafe; y++) {
                                if (x >= 0 && x < n && y >= 0 && y < n && board[x][y] == 1) {
                                    isSafe = false;
                                }
                            }
                        }
                        if (isSafe) {
                            safe++;
                        }
                    }
                }
            }

            return safe;
        }
    }
}
