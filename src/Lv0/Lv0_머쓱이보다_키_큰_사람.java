package Lv0;

public class Lv0_머쓱이보다_키_큰_사람 {
    class Solution {
        public int solution(int[] array, int height) {
            int answer = 0;
            for (int i:array) {
                if (height < i) {
                    answer += 1;
                }
            }
            return answer;
        }
    }
}
