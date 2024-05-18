package Lv0;

public class Lv0_숨어있는숫자의덧셈 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;

            // 문자열을 순회하며 숫자만 추출
            for (char c : my_string.toCharArray()) {
                if (Character.isDigit(c)) {
                    answer += Character.getNumericValue(c);
                }
            }

            return answer;
        }
    }


}
