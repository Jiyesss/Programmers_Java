package Lv0;
// 각도기
public class Lv0_각도기 {
    class Solution {
        public int solution(int angle) {
            int answer;
            if (angle > 0 && angle < 90)
                answer = 1;
            else if (angle == 90)
                answer = 2;
            else if (angle >90 && angle < 180)
                answer = 3;
            else
                answer = 4;
            return answer;
        }
    }
}
