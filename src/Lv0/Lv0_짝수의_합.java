package Lv0;
// 짝수의 합
public class Lv0_짝수의_합 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            while (n > 0)
                if (n % 2 == 0) {
                    answer += n;
                    n -= 2;
                }
                else {
                    n -= 1;
                    answer += n;
                    n -= 2;
                }

            return answer;
        }
    }
}
