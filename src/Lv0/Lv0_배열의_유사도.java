package Lv0;

public class Lv0_배열의_유사도 {
    class Solution {
        public int solution(String[] s1, String[] s2) {
            int answer = 0;
            for (int i =0;i <= s1.length-1; i++){
                for (int j=0; j <= s2.length-1; j++) {
                    if (s1[i].equals(s2[j])) {
                        answer += 1;

                    }
                }
            }
            return answer;
        }
    }
}
