package Lv0;

public class Lv0_피자_나눠_먹기 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i =1; i<=n; i++) {
                if (i % 7 == 1) {
                    answer += 1;
                }
            }

            return answer;
        }
    }
}
