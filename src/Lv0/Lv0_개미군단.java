package Lv0;

public class Lv0_개미군단 {
    class Solution {
        public int solution(int hp) {
            int answer = 0;
            while (hp > 0) {
                if (hp >= 5) {
                    hp -= 5;
                    answer += 1;
                }
                else if (hp >= 3) {
                    hp -= 3;
                    answer += 1;
                }
                else {
                    answer += hp;
                    hp = 0;

                }
            }
            return answer;

        }
    }

}
