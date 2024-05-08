package Lv1;
import java.util.*;
public class Lv1_크레인_인형뽑기게임 {


    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            List<Integer> basket = new ArrayList<Integer>();

            for (int move : moves) { // 각 move 별로
                for (int j = 0; j < board.length; j++) { // board의 각 행
                    int column = move - 1; // board의 열

                    if (board[j][column] != 0) { // 해당 위치에 인형이 있는 경우
                        int doll = board[j][column]; // 인형 뽑기
                        board[j][column] = 0;

                        if (!basket.isEmpty() && basket.get(basket.size() - 1) == doll) {
                            // 바구니의 마지막 인형이 현재 꺼낸 인형과 같은 경우
                            basket.remove(basket.size() - 1); // 바구니에서제거
                            answer += 2; // 터뜨린 인형의 개수
                        } else {
                            // 바구니에 인형추가
                            basket.add(doll);
                        }
                        break;
                    }
                }
            }
            return answer;
        }
    }


}
