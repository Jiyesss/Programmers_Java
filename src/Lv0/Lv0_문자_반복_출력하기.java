package Lv0;

public class Lv0_문자_반복_출력하기 {
    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";
            for (int i = 0; i < my_string.length(); i++) {
                char c = my_string.charAt(i);
                for (int j = 0; j < n; j++) {
                    answer += c;
                }
            }
            return answer;
        }
    }

}
