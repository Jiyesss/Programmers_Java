package Lv0;

public class Lv0_아이스_아메리카노 {
    class Solution {
        public int[] solution(int money) {
            int[] answer = new int[2];
            answer[0] = money / 5500;
            answer[1] = money - 5500 * (answer[0]);
            return answer;
        }
    }
}
