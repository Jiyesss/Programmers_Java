package Lv0;

public class Lv0_문자열_뒤집기 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";
            for (int i=my_string.length()-1;i>=0;i--)
                answer += my_string.charAt(i);
            return answer;
        }
    }
}
