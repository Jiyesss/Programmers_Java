package Lv0;

public class Lv0_연속된_숫자의_합 {
    class Solution {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];
            int sum= 0;
            for (int i =1;i < num; i++) {
                sum += i;
            }
            int start = (total - sum ) / num;

            for (int j = 0; j < num; j++) {
                answer[j] = start + j;

            }
            return answer;
        }
    }

}
