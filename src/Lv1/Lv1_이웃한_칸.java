package Lv1;

public class Lv1_이웃한_칸 {
    class Solution {
        public int solution(String[][] board, int h, int w) {
            int n = board.length; // board의 길이 저장
            int count = 0; // 같은 색으로 색칠된 칸의 개수 저장
            int[] dh = {0,1,-1,0}; // h의 변화량 저장
            int[] dw = {1,0,0,-1}; // w의 변화량 저장

            for (int i=0; i<4; i++) {
                int h_check = h + dh[i]; // 체크할 칸의 h좌표를 나타냄
                int w_check = w + dw[i]; // 체크할 칸의 w좌표를 나타냄

                if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                    if (board[h][w].equals(board[h_check][w_check])) count += 1;
                }
            }
            return count;
        }
    }
}
