package Lv1;

public class Lv1_문자열_나누기 {
    class Solution {
        public int solution(String s) {
            int answer = 0;
            int count = 0;
            while (!s.isEmpty() ){ //남은 부분이 없을 때까지
                for (int i=0; i < s.length(); i++) { //남은 s에 대해 반복
                    char x = s.charAt(0); // s의 첫 글자
                    if (s.charAt(i) == x) { // x와 같으면 +1
                        count ++;
                    }
                    else count --; // x와 다르면 -1

                    if (count == 0 || i == s.length() - 1) { // 횟수가 같거나 더 이상 읽을 글자가 없으면
                        s = s.substring(i+1);
                        answer ++;
                        break;

                    }

                }


            }
            return answer;
        }
    }


}
