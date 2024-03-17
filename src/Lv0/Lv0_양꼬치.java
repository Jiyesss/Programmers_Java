package Lv0;

public class Lv0_양꼬치 {
    class Solution {
        public int solution(int n, int k) {
            int answer = 0;
            answer += (( n * 12000 ) + ( k * 2000 ));
            answer -= (((int) n/10) * 2000);

            return answer;
        }
    }
}
